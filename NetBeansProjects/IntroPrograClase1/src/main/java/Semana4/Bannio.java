/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM04;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class Bannio {
    boolean espejo=true;
    boolean escuzado = true; 
    boolean ducha = true;
    boolean lavamanos = true;
    int usosPastaDental = 25;
    boolean llaveAbierta = false;
    int shampoo = 100;
    int jabon = 50;
    
    public void Lavarse_dientes(int dientes){
        if(this.usosPastaDental<0){
            JOptionPane.showMessageDialog(null, "SE acabó la pasta dental.");
        }else{
            this.usosPastaDental--;
        }
        
        JOptionPane.showMessageDialog(null, "Se lava los"+ dientes+" dientes.");
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
