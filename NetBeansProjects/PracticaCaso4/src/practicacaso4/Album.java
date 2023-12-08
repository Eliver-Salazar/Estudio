package practicacaso4;

/**
 *
 * @author Eliver Salazar Campo
 */
import javax.swing.*;


public class Album {
    private String nombre;
    private String nombreProductor;
    private String fechaLanzamiento;
    private int cantidadCanciones;
    private int cantidadReproducciones;
    private Cancion[] listaCanciones;
    private boolean publicado;

    public Album(String nombre, String nombreProductor, String fechaLanzamiento, int cantidadCanciones) {
        this.nombre = nombre;
        this.nombreProductor = nombreProductor;
        this.fechaLanzamiento = fechaLanzamiento;
        this.cantidadCanciones = cantidadCanciones;
        this.cantidadReproducciones = 0;
        this.listaCanciones = new Cancion[cantidadCanciones];
        this.publicado = false;
    }

    public void agregarCancion(Cancion cancion, int posicion) {
        if (posicion >= 0 && posicion < cantidadCanciones) {
            listaCanciones[posicion] = cancion;
        } else {
            JOptionPane.showMessageDialog(null, "Posición de canción no válida.");
        }
    }

    public void aumentarReproducciones(Cancion[] canciones) {
        for (Cancion cancion : canciones) {
            if (cancion != null) {
                cantidadReproducciones += cancion.reproducciones;
            }
        }
    }

    public void publicar() {
        if (!publicado) {
            publicado = true;
            JOptionPane.showMessageDialog(null, "Álbum publicado con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "El álbum ya ha sido publicado.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreProductor() {
        return nombreProductor;
    }

    public void setNombreProductor(String nombreProductor) {
        this.nombreProductor = nombreProductor;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    public int getCantidadReproducciones() {
        return cantidadReproducciones;
    }

    public void setCantidadReproducciones(int cantidadReproducciones) {
        this.cantidadReproducciones = cantidadReproducciones;
    }

    public Cancion[] getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(Cancion[] listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public boolean isPublicado() {
        return publicado;
    }

    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }
}



