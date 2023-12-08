package practicacaso4;

/**
 *
 * @author Eliver Salazar Campo
 */
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear artistas
        Artista artista1 = new Artista("Artista1", "Apellido1", "01/01/2023", GeneroMusica.POPULAR, PaisResidencia.COSTA_RICA);
        Artista artista2 = new Artista("Artista2", "Apellido2", "02/02/2023", GeneroMusica.ROCK, PaisResidencia.EL_SALVADOR);
        Artista artista3 = new Artista("Artista3", "Apellido3", "03/03/2023", GeneroMusica.REGGAETON, PaisResidencia.HONDURAS);

        // Crear álbumes y canciones
        artista1.crearAlbum("Album1", "Productor1", "01/01/2023", 3);
        artista1.agregarCancionAlbum(0, new Cancion("Cancion1", 180, "Productor1", GeneroMusica.POPULAR), 0);
        artista1.agregarCancionAlbum(0, new Cancion("Cancion2", 200, "Productor2", GeneroMusica.POPULAR), 1);
        artista1.agregarCancionAlbum(0, new Cancion("Cancion3", 220, "Productor3", GeneroMusica.POPULAR), 2);

        artista2.crearAlbum("Album2", "Productor2", "02/02/2023", 3);
        artista2.agregarCancionAlbum(0, new Cancion("Cancion4", 240, "Productor4", GeneroMusica.ROCK), 0);
        artista2.agregarCancionAlbum(0, new Cancion("Cancion5", 260, "Productor5", GeneroMusica.ROCK), 1);
        artista2.agregarCancionAlbum(0, new Cancion("Cancion6", 280, "Productor6", GeneroMusica.ROCK), 2);

        artista3.crearAlbum("Album3", "Productor3", "03/03/2023", 3);
        artista3.agregarCancionAlbum(0, new Cancion("Cancion7", 300, "Productor7", GeneroMusica.REGGAETON), 0);
        artista3.agregarCancionAlbum(0, new Cancion("Cancion8", 320, "Productor8", GeneroMusica.REGGAETON), 1);
        artista3.agregarCancionAlbum(0, new Cancion("Cancion9", 340, "Productor9", GeneroMusica.REGGAETON), 2);

        // Calcular longitud de los álbumes
        int longitudAlbumes = artista1.calcularLongitudAlbumes() +
                             artista2.calcularLongitudAlbumes() +
                             artista3.calcularLongitudAlbumes();

        // Imprimir resultado
        JOptionPane.showMessageDialog(null, "La longitud total de los álbumes es: " + longitudAlbumes + " segundos.");
    }
}

