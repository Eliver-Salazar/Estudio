/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

public class Espacio {
    private int identificador;
    private boolean activo;
    private String tipo;
    private int capacidad;
    private int espaciosDisponibles;

    public Espacio(int identificador, String tipo, int capacidad) {
        this.identificador = identificador;
        this.activo = true; // Se activa por defecto al crear un espacio
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.espaciosDisponibles = capacidad;
    }

    // Métodos para agregar, editar e inactivar espacios

    public void editarEspacio(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.espaciosDisponibles = capacidad; // Al editar, se reinicia la cantidad de espacios disponibles
    }

    public void inactivarEspacio() {
        this.activo = false;
        this.espaciosDisponibles = 0; // Cuando se inactiva, no hay espacios disponibles
    }

    // Otros métodos getter y setter según sea necesario

    public int getIdentificador() {
        return identificador;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    public void setEspaciosDisponibles(int espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }
}
