package Semana1;

import javax.swing.JOptionPane;

public class Ejercicio1S1 {


    public static void main(String[] args) {
        //Declarar tipos de variable
        int numeroUno;
        int numeroDos;
        int numeroTres;
        int numeroCuatro;
        int SumaEdad;
        float EdadPromedio;
        float Promedio = 4;
        
        //Asignar valores a las variables
        numeroUno = 11;
        numeroDos = 26;
        numeroTres = 33;
        numeroCuatro = 41;
        
        //Operación suma y promedio
        SumaEdad = (numeroUno + numeroDos + numeroTres + numeroCuatro);
        EdadPromedio = SumaEdad / Promedio;
        
        //Mostrar resultado de las operaciones
        JOptionPane.showMessageDialog(null, "La suma de las edades es de: " + SumaEdad + "\n"
                + "Y el promedio de la suma de las edades es de: " + EdadPromedio);
                
               
       
    }
    
}
