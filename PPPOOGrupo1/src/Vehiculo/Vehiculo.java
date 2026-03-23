/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculo;

import java.util.Objects;


public abstract class Vehiculo{
    String marca; 
    String modelo;
    String placa;

    public Vehiculo(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public void mostrarInfoGeneral(){
        System.out.println("Marca: " + marca);
        System.out.println("Nombre: " + modelo);
        System.out.println("Placa: " + placa);
    }
    
    public double calcularAutonomia(){
        return 0; 
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.placa, other.placa);
    }
    
}
