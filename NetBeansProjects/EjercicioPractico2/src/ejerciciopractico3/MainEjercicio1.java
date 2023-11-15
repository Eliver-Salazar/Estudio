/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico3;

public class MainEjercicio1 {
    
    public static void main(String[] args) {
        
        // Declarar y generar automáticamente los salarios
        double salarios [] = new double [100];
        GeneradorSalarios.generarSalarios(salarios);

        // Mostrar salarios antes de ordenar
        System.out.println("Salarios antes de ordenar:");
        MostradorSalarios.mostrarSalarios(salarios);

        // Aplicar ordenamiento burbuja con un ciclo for
        OrdenadorSalarios.ordenarSalariosBurbuja(salarios);

        // Mostrar salarios después de ordenar
        System.out.println("\nSalarios despues de ordenar:");
        MostradorSalarios.mostrarSalarios(salarios);
    }
}


 