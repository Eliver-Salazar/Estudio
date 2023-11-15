/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM04;

/**
 *
 * @author mbp_jay
 */
public class Persona {
    
    int dientes = 32;
    boolean estomago = true;
    boolean cuerpo =true;
    boolean haDormido = true;
    boolean haComido = true;
    int manos = 2;
    
    Bannio bannio = new Bannio();
    
    //persona se lava los dientes
    
    public void Lava_dientes_Luego_de_comer(){
        //va a ir al baño a lavarse los dientes
        this.bannio.Lavarse_dientes(this.dientes);
    }
}
