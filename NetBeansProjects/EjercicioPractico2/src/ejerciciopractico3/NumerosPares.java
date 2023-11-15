/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3;

/**
 *
 * @author Eliver Salazar Campo
 */
public class NumerosPares {

    public static void imprimirNumerosPares(int[][] arregloBidimensional) {
        for (int i = 0; i < arregloBidimensional.length; i++) {
            for (int j = 0; j < arregloBidimensional[i].length; j++) {
                if (arregloBidimensional[i][j] % 2 == 0) {
                    System.out.print(arregloBidimensional[i][j] + " ");
                }
            }
        }
    }
}
                
    
