/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo; 
import java.util.ArrayList;

public class PruebaFlota {
    public static void main(String[] args){
    
        ArrayList<Camion> arregloCamion = new ArrayList<>();
        ArrayList<Furgoneta> arregloFurgoneta = new ArrayList<>();

        Camion C1 = new Camion(1000, "Toyota", "Hino", "ABC123");
        Camion C2 = new Camion(2000, "Chevrolet", "NPR", "DEF456");
        Camion C3 = new Camion(3000, "Ford", "Cargo", "GHI789");
        Camion C4 = new Camion(4000, "Isuzu", "FRR", "JKL012");

        Furgoneta F1 = new Furgoneta(500.0, "Renault", "ABC123", "Kangoo"); 
        Furgoneta F2 = new Furgoneta(600.0, "Chevrolet", "DEF456", "N300");
        Furgoneta F3 = new Furgoneta(700.0, "Nisan", "GHI789", "Partner");
        Furgoneta F4 = new Furgoneta(800.0, "Ferrari", "MEP799", "Fiorino");

        agregarCamion(arregloCamion, C1);
        agregarCamion(arregloCamion, C2);
        agregarCamion(arregloCamion, C3);
        agregarCamion(arregloCamion, C4);

        agregarFurgoneta(arregloFurgoneta, F1);
        agregarFurgoneta(arregloFurgoneta, F2);
        agregarFurgoneta(arregloFurgoneta, F3);
        agregarFurgoneta(arregloFurgoneta, F4);
        
        
        for (Furgoneta f : arregloFurgoneta) {
            f.mostrarInfoGeneral();
            System.out.println("Autonomía: " + f.calcularAutonomia());
        }
        for (Camion c : arregloCamion) {
            c.mostrarInfoGeneral();
            System.out.println("Autonomía: " + c.calcularAutonomia());
        }
        for (Camion c : arregloCamion) {
            c.asignarRuta();
            c.asignarRuta("Medellín");
            c.asignarRuta("Cali", 400);

            System.out.println("Autonomía: " + c.calcularAutonomia());
        }
    } 
    
    public static void agregarCamion(ArrayList<Camion> arregloCamion, Camion nuevo) {
        boolean existe = false;

        for (Camion c : arregloCamion) {
            if (c.getPlaca().equals(nuevo.getPlaca())) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            arregloCamion.add(nuevo);
        }
    }

    public static void agregarFurgoneta(ArrayList<Furgoneta> arregloFurgoneta, Furgoneta nuevo) {
        boolean existe = false;

        for (Furgoneta f : arregloFurgoneta) {
            if (f.getPlaca().equals(nuevo.getPlaca())) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            arregloFurgoneta.add(nuevo);
        }
    }
   
}
