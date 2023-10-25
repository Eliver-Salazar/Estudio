/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoLaboratorio2;

/**
 *
 * @author Eliver Salazar Campo
 */
/**
 * Clase para representar una canción en Spotify.
 */
public class EjercicioCancion {
    public static void main(String[] args) {
        // Crear una instancia de la clase Cancion
        Cancion cancion1 = new Cancion(1, "Nombre de la Cancion", "Nombre del Autor", 180, 2023);
      
        // Acceder a los atributos usando getters
        System.out.println("ID de la cancion: " + cancion1.getIdCancion());
        System.out.println("Titulo de la cancion: " + cancion1.getTitulo());
        System.out.println("Autor de la cancion: " + cancion1.getAutor());
        System.out.println("Duracion de la cancion: " + cancion1.getDuracion() + " segundos");
        System.out.println("Annio de creacion de la cancion: " + cancion1.getAnioCreacion());

        // Modificar atributos usando setters
        cancion1.setDuracion(200); // Cambiar la duración de la canción
        cancion1.setAnioCreacion(2022); // Cambiar el año de creación

        System.out.println("Nueva duracion de la cancion: " + cancion1.getDuracion() + " segundos");
        System.out.println("Nuevo annio de creacion de la cancion: " + cancion1.getAnioCreacion());
    }
}
