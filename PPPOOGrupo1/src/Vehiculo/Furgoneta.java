/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

/**
 *
 * @author tatia
 */

public class Furgoneta extends Vehiculo {
    double volumenLitros;

    public Furgoneta(double volumenLitros, String marca, String modelo, String placa) {
        super(marca, modelo, placa);
        this.volumenLitros = volumenLitros;
    }
    
    @Override
    public double calcularAutonomia() {
        return volumenLitros * 0.3;
    }
}
