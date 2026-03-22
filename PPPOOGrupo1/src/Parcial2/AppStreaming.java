/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AppStreaming {
    public static void main (String[] args){
        
        ArrayList<Pelicula> peliculas = new ArrayList <>();
        Pelicula p1 = new Pelicula();
        p1.titulo = "interestellar";
        p1.director="pepe";
        p1.anioLanzamiento=2016;
        p1.duracionMinutos=120;
        Pelicula p2 = new Pelicula();
        p2.titulo = "El Rey Leon";
        p2.director="pepe";
        p2.anioLanzamiento=2012;
        p2.duracionMinutos=112;
        ArrayList<Podcast> podcasts = new ArrayList<>();
        Podcast po1 = new Podcast();
        Podcast po2 = new Podcast();
        po1.titulo="vida";
        po1.anfitrion="Sofia";
        po1.anioLanzamiento=2014;
        po1.duracionMinutos=39;
        po2.titulo="historia";
        po2.anfitrion="valentina";
        po2.anioLanzamiento=2026;
        po2.duracionMinutos=100;
        
        if (peliculas.get(0).equals(peliculas.get(1))) {
            System.out.println("Las películas son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        if (podcasts.get(0).equals(podcasts.get(1))) {
            System.out.println("Las películas son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        
        for (Pelicula pe : peliculas){
            System.out.println("Titulo: " + pe.titulo);
            System.out.println("Director: " + pe.director);
            System.out.println("Anio: " + pe.anioLanzamiento);
            System.out.println("Minutos de duracion: " + pe.duracionMinutos);
            pe.iniciarReproduccion();
        }
        
        for (Podcast po : podcasts){
            System.out.println("Titulo: " + po.titulo);
            System.out.println("Anfitrion: " + po.anfitrion);
            System.out.println("Anio: " + po.anioLanzamiento);
            System.out.println("Minutos de duracion: " + po.duracionMinutos);
            po.iniciarReproduccion();
        }
        
        peliculas.get(1).configurarVisualizacion();
        peliculas.get(1).configurarVisualizacion("1080p");
        peliculas.get(1).configurarVisualizacion("1080p", "Espanol");
    }
}
