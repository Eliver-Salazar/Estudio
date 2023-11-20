/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3;

/**
 *
 * @author Eliver Salazar Campo
 */
public class NumerosImpares {

    public static void imprimirNumerosImpares(int arreglo[][]) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] % 2 > 0) {
                    System.out.print(arreglo[i][j] + " ");
                }
            }
        }
    }
}
                
    
