/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3;

/**
 *
 * @author Eliver Salazar Campo
 */
public class MainEjercicio2y3 {
    
    public static void main(String[] args) {
        
        // Crear un array bidimensional para los días del mes
        int diasDelMes [][] = new int[5][7];

        // Inicializar el array con los días del mes
        int dia = 1;
        for (int i = 0; i < diasDelMes.length; i++) {
            for (int j = 0; j < diasDelMes[i].length; j++) {
                if (dia <= 30) { // Asumiendo un mes de 30 días
                    diasDelMes[i][j] = dia;
                    dia++;
                }
            }
        }

        // Imprimir el array bidimensional
        for (int i = 0; i < diasDelMes.length; i++) {
            for (int j = 0; j < diasDelMes[i].length; j++) {
                System.out.print(diasDelMes[i][j] + "\t");
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        // Imprimir solo los números pares utilizando la clase MainEjercicio2y3
        System.out.println("\nNúmeros pares del mes:");
        NumerosPares.imprimirNumerosPares(diasDelMes);
    }
}

