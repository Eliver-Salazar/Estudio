/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM09;

import SEM06.Cedula;
import SEM08.Estudiante;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class ArreglosUnidimensionales {
    public static void main(String[]args){
          
        int arregloEdades[] = {12,84,34,75,1,44,20};
        
        for(int i =0 ; i<arregloEdades.length; i++){
             System.out.println(arregloEdades[i]);
         }
          System.out.println("\n");
          System.out.println("\n");
         Arrays.sort(arregloEdades);
         for(int i =0 ; i<arregloEdades.length; i++){
             System.out.println(arregloEdades[i]);
         }
        
        
        Estudiante arregloEstudiante[];
        arregloEstudiante = new Estudiante[10];
        
        //Se utiliza la posicion dentro de los parentesis cuadrados
        //para ubicar el espacio en memoria a leer/guardar/modificar
        //arregloEstudiante[0] = new Estudiante();
        //arregloEstudiante[9] = new Estudiante();
        
        
        //llenar ciclicamente
        for(int i =0; i<10; i++){
            Estudiante estudiante = new Estudiante();
            //ingresa provincia de cedula
            String provinciaLectura = JOptionPane.showInputDialog(null, "ingrese su provincia");
            provinciaLectura = provinciaLectura.toUpperCase();
         
            //ingresa provincia cedula
            estudiante.setCedula(Cedula.valueOf(provinciaLectura));
            
            //ingresa edad
            estudiante.setEdad((int)(Math.random()*(double)100.00));
            
            System.out.println(estudiante.getEdad());
            arregloEstudiante[i] = estudiante;
        }
        
            
        ArreglosUnidimensionales arreglosFunciones = new ArreglosUnidimensionales();
        arregloEstudiante= arreglosFunciones.ordenarGrupo(arregloEstudiante);
        
        
        
        
        for(int i =0; i<10; i++){
             if(arregloEstudiante[i].getCedula() == Cedula.ALAJUELA ||
            arregloEstudiante[i].getCedula() == Cedula.CARTAGO){
                 //5%;
             }
             
             arregloEstudiante[i].EnviarSolicitudCoonesup();
             
            System.out.println("Estudiante "+i+" nacio en provincia "+ arregloEstudiante[i].getCedula()+" y su edad es:"+arregloEstudiante[i].getEdad()+"años");
            
        }
    }

    public Estudiante[] ordenarGrupo(Estudiante[] estudiantes){
        //bubble sort
        //ordenado de burbuja: recorre el arreglo y compara el actual objeto en el indice con el 
        ///anterior, si se cumple la condicion de linea 70, entonces invierte el orden de los dos 
        //objetos, y avanza al siguiente elemento en el arreglo.
            for (int i = 0; i < estudiantes.length; i++) {
                for (int j = 1; j < (estudiantes.length - i); j++) {
                    if (estudiantes[j - 1].getEdad() < estudiantes[j].getEdad()) {
                        Estudiante temporal = estudiantes[j - 1];
                        estudiantes[j - 1] = estudiantes[j];
                        estudiantes[j] = temporal;
                    }
                }
            }
        return estudiantes;   
    }
}
