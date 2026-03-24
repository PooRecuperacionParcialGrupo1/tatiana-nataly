/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2;

/**
 *
 * @author User
 */
abstract public class ContenidoMultimedia {
    String titulo;
    int duracionMinutos;
    int anioLanzamiento;
    
    public abstract void iniciarReproduccion();
    
    
    public String obtenerResumen(){
        return ("Titulo: "+ titulo + "Anio de lanzamiento: " + anioLanzamiento);
    }
}