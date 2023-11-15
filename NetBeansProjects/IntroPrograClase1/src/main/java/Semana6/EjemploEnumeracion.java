/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM06;

import SEM08.Estudiante;
import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class EjemploEnumeracion {
    
    public static void main(String[] args){
        
         Estudiante estudiante = new Estudiante();
         estudiante.setCedula(Cedula.HEREDIA);
         System.out.println(estudiante.getCedula());
         
         String provinciaLectura = JOptionPane.showInputDialog(null, "ingrese su provincia");
         provinciaLectura = provinciaLectura.toUpperCase();
         
         estudiante.setCedula(Cedula.valueOf(provinciaLectura));
         System.out.println(provinciaLectura);
    }
}

