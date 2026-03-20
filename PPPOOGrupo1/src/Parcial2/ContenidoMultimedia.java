/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2;

import java.util.Objects;

/**
 *
 * @author User
 */
abstract public class ContenidoMultimedia {
    String titulo;
    int duracionMinutos;
    int anioLanzamiento;
    
    public abstract void iniciarReproduccion();
    
    String obtenerResumen(){
        return ("Titulo: "+ titulo + "Anio de lanzamiento: " + anioLanzamiento);
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final ContenidoMultimedia other = (ContenidoMultimedia) obj;
        return Objects.equals(this.titulo, other.titulo);
    }
    
    
}
