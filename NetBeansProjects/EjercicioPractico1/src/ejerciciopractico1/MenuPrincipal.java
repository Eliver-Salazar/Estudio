/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico1;

/**
 *
 * @author Eliver Salazar Campo
 */

import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static void main(String[] args) {
        // Solicitar al usuario la información para crear una instancia de Casa
        double id = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ID de la casa:"));
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de casa:");
        String color = JOptionPane.showInputDialog("Ingrese el color de la casa:");
        boolean garaje = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene garaje? (true/false):"));
        int habitaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de habitaciones:"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la casa:"));

        // Crear una instancia de Casa con los datos proporcionados por el usuario
        Casa miCasa = new Casa(id, tipo, color, garaje, habitaciones, valor);

        // Llamar al método ImprimeCasa
        miCasa.ImprimeCasa();

        // Solicitar al usuario la cantidad de años para calcular la proyección
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de años para calcular la proyección:");
        int annios = Integer.parseInt(input);

        // Llamar al método CalculaProyeccion con la cantidad de años ingresada por el usuario
        miCasa.CalculaProyeccion(annios);
    }
}

