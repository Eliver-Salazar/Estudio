/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico3;

/**
 *
 * @author Eliver Salazar Campo
 */
public class GeneradorSalarios {
    
    public static void generarSalarios(double[] salarios) {
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = (int) (Math.random() * 5000);
        }
    }
}

