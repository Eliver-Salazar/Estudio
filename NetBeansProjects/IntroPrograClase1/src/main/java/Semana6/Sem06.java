/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEM06;

/**
 *
 * @author mbp_jay
 */
public class Sem06 {
    public static void main(String[] args){
    Casa hogar = new Casa();
    //hogar.calcularCantidadHabitaciones();
    hogar.ejecutar();
    
    
    //guardar una nueva cantidad de ventanas
//    hogar.setCantidadVentanas(1);
//    System.out.println(hogar.getCantidadVentanas());

//
//     Usuario user = new Usuario();
//     user.nombre = "Juan Alberto Davila";
//     user.setPassword("prueba123");
//     System.out.println(user.getPassword());
//     
//     user.setPassword("pruuba123");
//     System.out.println(user.getPassword());
//     
//     user.setPassword("pru");
//     System.out.println(user.getPassword());


//       Casa hogar2 = new Casa("Pedro", "Villaneda", 1);
//       System.out.println(hogar2.imprimir());
//       
//       Casa hogar3 = new Casa();
//       System.out.println(hogar3.imprimir());

//       Usuario user = new Usuario("prueba123");
//       System.out.println(user.imprimir());
//       
//       //genera un pw con math.random
//       Usuario user2 = new Usuario();
//       System.out.println(user2.imprimir());

       Configuracion config = new Configuracion();
       
       //año
       System.out.println(config.annio);
       Configuracion.annio = 2024;
       System.out.println(config.annio);

       //sistema operativo
       System.out.println(config.sistemaOperativo);
       Configuracion.sistemaOperativo = "Unix";
       System.out.println(config.sistemaOperativo);
       
    }
}
