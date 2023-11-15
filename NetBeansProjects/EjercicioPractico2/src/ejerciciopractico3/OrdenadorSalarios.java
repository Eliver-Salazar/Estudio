/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3;

/**
 *
 * @author Eliver Salazar Campo
 */
public class OrdenadorSalarios {
    
    // Aplicar ordenamiento burbuja con un ciclo for
    public static void ordenarSalariosBurbuja(double salarios[]) {
        int n = salarios.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (salarios[j] > salarios[j + 1]) {
                    // Intercambiar salarios[j] y salarios[j + 1]
                    double temp = salarios[j];
                    salarios[j] = salarios[j + 1];
                    salarios[j + 1] = temp;
                }
            }
        }
    }
}

