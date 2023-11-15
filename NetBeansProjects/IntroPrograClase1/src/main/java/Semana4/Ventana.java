/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM04;

/**
 *
 * @author mbp_jay
 */
public class Ventana {
    String posicion;
    String lado;
    boolean polarizada;
    String material;
    String locacion;
    int annio_fabricacion= 2020;
    
    //Pasos: quita seguro, agarra mango, acciona el sistema hacia afuera, 
    // desliza sobre riel, dispara seguro secundario, bloquea el anclaje de la ventana
    public void AbrirVentana(){}
    public void CerrarVentana(){}
    public void Polarizar(String material){
        //
        int a = 1+1;
        this.material = "vidrio";
    }
    public void RemoverPolarizado(){}
    public Ventana DevolverInstancia(){
        //return new Ventana();
        
        return this;
    }
}
