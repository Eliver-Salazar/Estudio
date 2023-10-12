package Semana2;

import javax.swing.JOptionPane;

public class ClaseProfeS2 {

    public static void main(String[] args) {
        //REPASO SEM 01

        //proyeccion de 5 años
        //Leer el valor Edad del usuario
        //String lectura = JOptionPane.showInputDialog(null, "Ingrese su edad en números.");
//        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad en números."));
        
//        int annio = 2023;
        
        //Calcular la edad del usuario al cabo de este periodo.
//        edad = edad + 5;
        
        //Mostrar al usuario "La edad en 5 años será: x"
//        JOptionPane.showMessageDialog(null, "La edad en 5 años será: "+edad);
        //"La edad en 5 años será: 15"
        
        
        
        //CLASE SEMANA 02
        
        
        //Estructuras de decision
        if(1==1){
//            JOptionPane.showMessageDialog(null,"El resultado es verdadero.");   
        }
        
        if(1>2){
//            JOptionPane.showMessageDialog(null,"Es mayor que 2.");
        }
        
        if(2>1){
//            JOptionPane.showMessageDialog(null,"Es mayor que 1.");
        }
        
        if(2>=2){
//              JOptionPane.showMessageDialog(null,"Es mayor o igual que 2.");
        }
        
        if(2>2 || 2==2){
            //Verdadero
//            JOptionPane.showMessageDialog(null,"Verdadero");
        }//falso, continua la ejecución al final del bloque del if.
        
        
        if(5==5 && 4!=3){}
        if(5==5 && !(4==3)){
//            JOptionPane.showMessageDialog(null, "Es Verdadero");
        }
        
        
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota."));
        
        String resultado = "";
        if(nota>69){
            //el estudiante aprobó.
            resultado = "aprobó";
        }else{//Considera el resto de escenarios, resultado del analisis del If. 
            //(resultado da falso)
             resultado = "reprobó";
        }
        JOptionPane.showMessageDialog(null, "El estudiante "+resultado);
        
        
        
        
        
        // If anidado
        int edad = 18;
        int beca = 0;
        
        //si condicion a se cumple
        
        
        // Primer If:  edad>18 && edad <25  = verdadero / falso
            //Verdadero: beca = 100;
            //
           
                
            //If Anidado: edad<25 = verdadero / falso
                //Verdadero: Beca 100%
                //Falso: 50%.
        
        
        if(edad>18){
            //beca: 100;
            //beca:50;
            
            //beca 100;
            if(edad<25){
                beca = 100;
            }else{
                beca = 50;
            }
        }else{
            //no hay beca
            beca = 0;
        }
    }
}