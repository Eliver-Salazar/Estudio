/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegradorq3;

import javax.swing.JOptionPane;

/**
 *
 * @author mbp_jay
 */
public class Facturacion {
    
    //Una posicion por cada mes del año
    private Mes annioVentas[] = new Mes[12];

    public Facturacion() {
       this.InicializaMesesDelAnnio();
    }
    

    
    public Factura AbreVentanaAgregarFactura(){
            String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de la factura.");
            double monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto de la factura."));
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la factura.");
            return new Factura(fecha, monto, nombre);
    }
    
    public Factura ConstruyeFacturaPrueba(){
        //Math.random()*10000
        double monto = (double)Math.random()*100000;
        return new Factura("",monto,"");
    }
    
    //AgregarFacturaMes
    public boolean AgregarFactura(MesDelAnnio mes, Factura factura){
        //hipotetico facturas no pueden ser negativas
        if(factura.getMonto()<=0){
            return false;
        }
        
        String nombreMes = mes.toString().toUpperCase();
        int indiceMes=0;
        switch(nombreMes){
            case "ENERO":
                indiceMes =0;
                break;
            case "FEBRERO":
                indiceMes =1;
                break;
            case "MARZO":
                indiceMes =2;
                break;
            case "ABRIL":
                indiceMes =3;
                break;
            case "MAYO":
                indiceMes =4;
                break;
            case "JUNIO":
                indiceMes =5;
                break;
            case "JULIO":
                indiceMes =6;
                break;
            case "AGOSTO":
                indiceMes =7;
                break;
             case "SEPTIEMBRE":
                 indiceMes =8;
                break;
            case "OCTUBRE":
                indiceMes =9;
                break;
             case "NOVIEMBRE":
                 indiceMes=10;
                break;
            case "DICIEMBRE":
                indiceMes=11;
                break;
        }
        

        //System.out.println("Mes en Facturacion, " +indiceMes);
        
        if(indiceMes == 5){
            System.out.println();
        }
        
        System.out.println("Insertando  en indice "+indiceMes+" factura con datos: "+factura.getMonto()+"");
        //registra factura en el mes correspondiente
        annioVentas[indiceMes].RegistraFactura(factura);
        return true;
    }
    
    public double CalculaRentaMetodo1(){
        
        //total de monto de venta
        //total de monto de impuesto
        
        //utilizando los consolidados de cada mes
        double consolidadoMontoSumaPorMes=0;
        double consolidadoImpuestoSumaPorMes=0;
        for(int i=0; i<annioVentas.length-1;i++){
            //recorremos cada uno de los meses del annio en el arreglo 
            //annioVentas
            consolidadoMontoSumaPorMes += annioVentas[i].getVentasMes();
            consolidadoImpuestoSumaPorMes += annioVentas[i].getImpuestos();   
        }
       
        
        //Categoria 1: 1               -              8.157.000           3%
        //Categoria 2: 8.157.001       -              37.550.000          10%
        //Categoria 3: 37.550.001      -              110.315.000         15%
        //Categoria 4: 110.315.001     o +                                20%
        return this.ObtenerCategoriaRenta(consolidadoMontoSumaPorMes);
        
    }
    
    public double CalcularRentaMetodo2(){
        double consolidadoMontoSumaPorMes=0;
        double consolidadoImpuestoSumaPorMes=0;
        for(int i=0; i<annioVentas.length-1;i++){
            //recorremos cada uno de los meses del annio en el arreglo 
            //annioVentas
            consolidadoMontoSumaPorMes += annioVentas[i].obtenerVentasMes();
            consolidadoImpuestoSumaPorMes += annioVentas[i].obtenerImpuestosMes();   
        }
        return this.ObtenerCategoriaRenta(consolidadoMontoSumaPorMes);
        
    }
    
    private double ObtenerCategoriaRenta(double monto){
        if(monto>1 && monto<= 8157000 ){
            return monto * 0.03;
        }else if(monto >8157001 && monto<=37550000){
            return monto * 0.10;
        }else if(monto>37550001 && monto<=110315000){
            return monto * 0.15;
        }else if(monto>110315000){
            return monto * 0.2;
        }
        return 0;
    }
    
    private void InicializaMesesDelAnnio(){
        //enero, febrero, etc
        for(int i=0; i<annioVentas.length; i++){
            this.annioVentas[i]= new Mes(MesDelAnnio.values()[i].toString());
        }
    }
            
}
