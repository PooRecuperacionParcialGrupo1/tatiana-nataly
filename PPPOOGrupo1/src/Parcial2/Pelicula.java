/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2;

/**
 *
 * @author User
 */
public class Pelicula extends ContenidoMultimedia {
    String director;

    @Override
    public void iniciarReproduccion() {
        System.out.println("cargando video y ajustando subtitulos para la oelicula");
    }
    
    public void configurarVisualizacion(){
        System.out.println("Reproduciendo en calidad automatica, idioma original");
    }
    public void configurarVisualizacion(artCalidad){
        System.out.println("Reproduciendo en calidad " + artCalidad);
    }
    public void configurarVisualizacion(calidad, idiomaSubtitulos){
        System.out.println("Reproduciendo en calidad " + calidad "con subtitulos en " + idiomaSubtitulos);
    }
}
