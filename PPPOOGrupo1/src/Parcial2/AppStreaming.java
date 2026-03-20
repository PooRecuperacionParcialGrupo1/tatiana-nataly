/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2;

/**
 *
 * @author User
 */
public class AppStreaming {
    public static void main (String[] args){
        
        Pelicula peliculas[] = new Pelicula[2];
        Podcast podcasts[] = new Podcast[2];
        peliculas[0] = new Pelicula();
        peliculas[0].titulo = "interestellar";
        peliculas[0].director = "Pepe";
        peliculas[0].anioLanzamiento=2016;
        peliculas[0].duracionMinutos=120;
        peliculas[1] = new Pelicula();
        peliculas[1].titulo = "Rey leon";
        peliculas[1].director = "Valentina";
        peliculas[1].anioLanzamiento=2016;
        peliculas[1].duracionMinutos=120;
        podcasts[0]=new Podcast();
        podcasts[0].titulo="vida";
        podcasts[0].duracionMinutos=60;
        podcasts[0].anfitrion="valeria";
        podcasts[0].anioLanzamiento=2020;
        podcasts[1]=new Podcast();
        podcasts[1].titulo="vida";
        podcasts[1].duracionMinutos=60;
        podcasts[1].anfitrion="valeria";
        podcasts[1].anioLanzamiento=2020;  
        
        if (peliculas[0].equals(peliculas[1])) {
            System.out.println("Las películas son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        if (podcasts[0].equals(podcasts[1])) {
            System.out.println("Las películas son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        
        for (Pelicula pe : peliculas){
            System.out.println("Título: " + pe.titulo);
            System.out.println("Director: " + pe.director);
            System.out.println("Año: " + pe.anioLanzamiento);
            System.out.println("Minutos de duracion: " + pe.duracionMinutos);
        }
        
        for (Podcast po : podcasts){
            System.out.println("Título: " + po.titulo);
            System.out.println("Anfitrion: " + po.anfitrion);
            System.out.println("Año: " + po.anioLanzamiento);
            System.out.println("Minutos de duracion: " + po.duracionMinutos);
        }
        
        peliculas[1].configurarVisualizacion();
        peliculas[1].configurarVisualizacion("1080p");
        peliculas[1].configurarVisualizacion("1080p", "Español");
    }
}
