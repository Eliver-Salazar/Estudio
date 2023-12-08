/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciointegradorq3;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class EjercicioIntegradorQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //if / switch
       //for, do while
       //Objetos, clases
       //arreglos de objetos uni/bidimensionales
       //encapsulacion de atributos
       
       //Requerimientos:
       //Clases:
       //Facturacion
       //Factura
       
       
       
       //Metodos:
       //AgregarMontoAConsolidado
       //AgregarFactura
      
       
       
       
       //definir objeto Facturacion.
       Facturacion facturacion = new Facturacion();
       //Ingresar Factura
       
       //facturacion.AgregarFactura(MesDelAnnio.MAYO, factura)
       //5 facturas por mes
       
       JOptionPane.showMessageDialog(null, "Bienvenido al sistema de Calculo de Renta. Debe ingresar 5 facturas para cada mes.");
       //repite por cada uno de los meses
       for(int c=0; c<12; c++){
            
            //repite para cada una de las 5 facturas por mes
            
            System.out.println("Mes: "+MesDelAnnio.values()[c].toString());
            for(int i=0; i<5; i++ ){
                    System.out.println("Factura: "+(i+1));
                    facturacion.AgregarFactura(MesDelAnnio.values()[c], facturacion.ConstruyeFacturaPrueba());
                    //facturacion.AgregarFactura(MesDelAnnio.values()[c], facturacion.AbreVentanaAgregarFactura());
                    //JOptionPane.showMessageDialog(null, "Factura ingresada satisfactoriamente");
            }
       }
       
       JOptionPane.showMessageDialog(null,facturacion.CalculaRentaMetodo1());
       
    }
    
}
