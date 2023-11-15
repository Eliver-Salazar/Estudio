package SEM06;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mbp_jay
 */
public class Casa {
    private int cantidadVentanas = 4;
    private String nombreApellido = "";
   
    
    //CONSTRUCTORES
    //1. no tienen un modificador de tipo 
    //2. Constructor se debe llamar igual que la clase donde se define
    //3. estructura: public <nombreClase>(parametros){codigo}
    //4. Los constructores pueden ser mas de 1, siempre y cuando
    //  No se repitan los tipos y el orden de atributos
    //  Ejemplo: Casa(int a, int b) 
    //          Casa (int numero1, int numero2)
    //  Es incorrecto, no pueden ser iguales los parametros con sus respectivos tipos
    // aunque los parametros en si se llamen diferente
    
    public Casa(int a, int b, int c){
        //asignacion de los datos  a los atributos
        this.cantidadVentanas = a;//a = 3
        this.nombreApellido ="IngreseSuApellido";
    }
    public Casa(String nombre,String apellido,int ventanas){
        this.cantidadVentanas = ventanas;
        this.nombreApellido = nombre+apellido;
    }
    
    public Casa(){
        
    }
    
    public String imprimir(){
        return "CantidadVentanas:"+this.cantidadVentanas+", nombreApellido:"+this.nombreApellido;
    }
    
    
    
    
    //SETTER  / GUARDADOR
    public void setCantidadVentanas(int dato){
        this.cantidadVentanas = dato; // variable int, guarde un String. int == String
    }
    
    public void setNombreApellido(String nombreApellido){
        //la palabra reservada "this." sube un nivel de contexto a la clase Casa.
        //Al escribir "this." se muestran en el menu de tecleo todos los atributos y metodos de la clase
       this.nombreApellido = nombreApellido;
    }
    
    //GETTER /"OBTENEDOR"
    
    public int getCantidadVentanas(){
        return this.cantidadVentanas;
    }
    
    
    public void ejecutar(){
        this.calcularCantidadHabitaciones();
    }
    
    
    private int calcularCantidadHabitaciones(){
        // Cada habitacion tiene 2 ventanas.
        //retorna calculo de cuantas habitaciones tiene la casa basado en la linea anterior.
        return this.cantidadVentanas/2;
    }
    
    public void realizarConexion(){
        this.conectarBaseDatos();
    }
    
    private void conectarBaseDatos(){
    //nombre de usuario
    //password
    this.ejecutar();
    }
}
