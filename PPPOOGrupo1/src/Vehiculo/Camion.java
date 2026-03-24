/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author tatia
 */
public class Camion extends Vehiculo {
    int capacidadCargaToneladas;
    String atrDestino;
    float atrDistanciaKm;

    public Camion(int capacidadCargaToneladas, String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }
    
    @Override
    public double calcularAutonomia() {
        return capacidadCargaToneladas * 0.5;
    }
    public void asignarRuta() {
        System.out.println("Ruta estándar asignada. Sin destino especifico aun.");
    }

    public void asignarRuta(String atrDestino) {
        System.out.println("Ruta asignada al destino: " + atrDestino);
    }

    public void asignarRuta(String atrDestino, float atrDistanciaKm ) {
        System.out.println("Ruta asignada a: " + atrDestino);
        System.out.println("Distancia Total: " + atrDistanciaKm);
        System.out.println("Preparando logistica pesada");
    }
 
}
