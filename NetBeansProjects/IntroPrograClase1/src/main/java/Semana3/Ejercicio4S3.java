package Semana3;

import javax.swing.JOptionPane;

public class Ejercicio4S3 {

   
    public static void main(String[] args) {
        
        
     //Ciclo While
     boolean repite = true;
     while(repite){
         int OpcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al menu"));
         if (OpcionMenu>0 && OpcionMenu<5){
         repite = false;
         }
     }

    }
}
    
