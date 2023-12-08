package practicacaso4;

/**
 *
 * @author Eliver Salazar Campo
 */

import javax.swing.*;

import javax.swing.*;

public class Cancion {
    private String nombre;
    private int duracionSegundos;
    private String productor;
    private GeneroMusica generoMusica;
    int reproducciones;

    public Cancion(String nombre, int duracionSegundos, String productor, GeneroMusica generoMusica) {
        this.nombre = nombre;
        this.duracionSegundos = duracionSegundos;
        this.productor = productor;
        this.generoMusica = generoMusica;
        this.reproducciones = 0;
    }

    public void aumentarReproducciones(int cantidad) {
        this.reproducciones += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public GeneroMusica getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(GeneroMusica generoMusica) {
        this.generoMusica = generoMusica;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }
}


