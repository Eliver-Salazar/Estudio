/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico1;

/**
 *
 * @author Eliver Salazar Campo
 */
import javax.swing.JOptionPane;

public class Casa {
    
    // Atributos privados
    private double id;
    private String tipo;
    private String color;
    private boolean garaje;
    private int habitaciones;
    private double valor;
    
    // Método para calcular la apreciación
    public void Apreciar() {
        double porcentajeApreciacion = 0.02; // Por defecto false
        if (garaje) {
            porcentajeApreciacion = 0.03; //Si tiene garage true
        }
        valor += valor * porcentajeApreciacion;
    }
    
    // Método para imprimir los atributos de la casa
    public void ImprimeCasa() {
        String infoCasa = "ID: " + id + "\nTipo: " + tipo + "\nColor: " + color + "\nGaraje: " + garaje +
                "\nHabitaciones: " + habitaciones + "\nValor: " + valor;
        JOptionPane.showMessageDialog(null, infoCasa);
    }

    // Método para calcular la proyección
    public void CalculaProyeccion(int Annios) {
        for (int i = 1; i <= Annios; i++) {
            Apreciar(); 
        }
        JOptionPane.showMessageDialog(null, "Proyección calculada por " + Annios + " años:\nValor: " + valor);
    }
    
    // Getter para Id
    public double getId() {
        return id;
    }
    // Setter para Id
    public void setId(double id) {
        this.id = id;
    }

    // Getter para Tipo
    public String getTipo() {
        return tipo;
    }
    // Setter para Tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter para Color
    public String getColor() {
        return color;
    }
    // Setter para Color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter para Garaje
    public boolean hasGaraje() {
        return garaje;
    }
    // Setter para Garaje
    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    // Getter para Habitaciones
    public int getHabitaciones() {
        return habitaciones;
    }
    // Setter para Habitaciones
    public void setHabitaciones(int habitaciones) {
        if (habitaciones > 0) {
            this.habitaciones = habitaciones;
        } else {
            this.habitaciones = 0;
        }
    }

    // Getter para Valor
    public double getValor() {
        return valor;
    }
    //Setter para Valor
    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            this.valor = 0;
        }
    }
    
    // Constructor que recibe un parámetro para asignar a Id
    public Casa(double id) {
        this.id = id;
    }

    // Constructor que recibe los 6 parámetros para asignar a cada atributo de la clase
    public Casa(double id, String tipo, String color, boolean garaje, int habitaciones, double valor) {
        this.id = id;
        this.tipo = tipo;
        this.color = color;
        this.garaje = garaje;
        if (habitaciones > 0) {
            this.habitaciones = habitaciones;
        } else {
            this.habitaciones = 0;
        }
        if (valor > 0) {
            this.valor = valor;
        } else {
            this.valor = 0;
        }
    }
}


