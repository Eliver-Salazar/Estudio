/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM05;

/**
 *
 * @author mbp_jay
 */
public class Estudiante {
    public String nombreCompleto;
    public int edad;
    public int creditosCursados = 0;
    public Carrera carrera;
    
    public Estudiante(String nombreCompleto, int edad, int creditosCursados, Carrera carrera){
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.creditosCursados = creditosCursados;
        this.carrera = carrera;
        this.ImprimeEnConsola("NombreCompleto: "+nombreCompleto+", Edad: "+edad+", Carrera: "+ this.carrera.nombre+", Creditos: "+this.carrera.creditos);
    }
    
    public int CalcularCreditosRestantes(){
        //calcula creditos restantes
        return  this.carrera.creditos - this.creditosCursados;
    }
    
    public void ImprimeEnConsola(String texto){
        System.out.println(texto);
    }
    
    
    public int CalculaCuatrimestresRestantes(){
        //Cada cuatrimestre cursa 16 creditos
        int creditosRestantes = this.CalcularCreditosRestantes();
        
        //redondeo para casos donde creditos sean menor or mayor que un multiplo de 16
        return Math.round((float) creditosRestantes/16);
    }
}
