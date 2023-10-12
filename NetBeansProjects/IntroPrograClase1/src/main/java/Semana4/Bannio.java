package Semana4;

import javax.swing.JOptionPane;

public class Bannio{
    
    //Class Baño
    boolean espejo=true;
    boolean escuzado = true; 
    boolean ducha = true;
    boolean lavamanos = true;
    int usosPastaDental = 25;
    boolean llaveAbierta = false;
    int shampoo = 100;
    int jabon = 50;
    
    public void Lavarse_dientes(){
        if(this.usosPastaDental<0){
            JOptionPane.showMessageDialog(null, "SE acabó la pasta dental.");
        }else{
            this.usosPastaDental--;
        }
    }
    
    public void Banniarse(){
        JOptionPane.showMessageDialog(null, "entra al bannio.");
        if(this.shampoo>0){
        this.shampoo--;
        }else{
                JOptionPane.showMessageDialog(null, "Se acabó el shampoo");
        }
        
        if(this.jabon>0){
         this.jabon--;
        }
        
        JOptionPane.showMessageDialog(null, "sale del bannio.");
        
    }
}

