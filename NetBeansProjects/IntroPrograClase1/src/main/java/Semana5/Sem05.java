/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM05;

/**
 *
 * @author mbp_jay
 */
public class Sem05 {
    public static void main(String[] args){
        Estudiante estudiante = new Estudiante("Pedro Gonzalez", 25, 13, new Carrera(58,"Ing. Sistemas"));
        
        estudiante.ImprimeEnConsola("Creditos restantes: "+ estudiante.CalcularCreditosRestantes());
        estudiante.ImprimeEnConsola("Estimacion de cuatrimestres restantes: "+estudiante.CalculaCuatrimestresRestantes());
    }
}
