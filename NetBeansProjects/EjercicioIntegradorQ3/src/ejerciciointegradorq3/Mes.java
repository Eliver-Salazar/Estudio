/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegradorq3;

import java.util.Arrays;

/**
 *
 * @author mbp_jay
 */
public class Mes {
    private Factura facturas[]=new Factura[0];
    private MesDelAnnio nombre;
    private double ventasMes;
    private double impuestos;

    public Mes(String nombre) {
        this.nombre = MesDelAnnio.valueOf(nombre);
    }
    
    //fecha, mes, monto, impuestos
    public void RegistraFactura(Factura factura){
        //Crear nueva factura y agregarla a el arreglo de factura.
        this.facturas = Arrays.copyOf(facturas, this.facturas.length+1);
        this.facturas[facturas.length-1] = factura;
        
        //Agregar los montos a Ventas e Impuestos del mes
        this.ventasMes += factura.getMonto();
        this.impuestos += factura.getImpuestos();
    }

    public Factura[] getFacturas() {
        return facturas;
    }

    public void setFacturas(Factura[] facturas) {
        this.facturas = facturas;
    }

    public MesDelAnnio getNombre() {
        return nombre;
    }

    public void setNombre(MesDelAnnio nombre) {
        this.nombre = nombre;
    }

    public double getVentasMes() {
        return ventasMes;
    }

    public void setVentasMes(double ventasMes) {
        this.ventasMes = ventasMes;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    
    public double obtenerVentasMes(){
        double sumaVentas = 0;
        for(int i = 0; i<facturas.length; i++){
            sumaVentas+=facturas[i].getMonto();
        }
        return sumaVentas;
    }
    public double obtenerImpuestosMes(){
        double sumaImpuestos = 0;
        for(int i = 0; i<facturas.length-1; i++){
            sumaImpuestos+=facturas[i].getImpuestos();
        }
        return sumaImpuestos;
    }
    
    
}
