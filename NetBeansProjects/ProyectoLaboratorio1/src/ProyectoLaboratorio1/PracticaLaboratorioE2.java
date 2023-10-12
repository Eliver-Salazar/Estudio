package ProyectoLaboratorio1;

import javax.swing.JOptionPane;


public class PracticaLaboratorioE2 {

    
    public static void main(String[] args) {
        double CompraGas = Double.parseDouble(JOptionPane.showInputDialog(
        "Favor indicar el monto deseado para echar gasolina"));
        
        double Descuento;
        double TotalPagar;
        double Impuesto;
        
        if (CompraGas >= 10000 && CompraGas <= 40000){
            Descuento = CompraGas * 0.10;
            TotalPagar = CompraGas - Descuento;
        }
        else if (CompraGas >=41000 && CompraGas <= 80000){
            Descuento = CompraGas * 0.15;
            TotalPagar = CompraGas - Descuento;
        }
        else if (CompraGas > 80000){
            Descuento = CompraGas * 0.20;
            TotalPagar = CompraGas - Descuento;
        }
        else{
            Descuento = 0;
            TotalPagar = CompraGas - Descuento;
        }
        
        Impuesto = TotalPagar * 0.13;  // Calculamos el impuesto
               
        TotalPagar += Impuesto; // Sumamos el impuesto al total a pagar
        
        JOptionPane.showMessageDialog(null,
                "Compra sin descuento: $" + CompraGas + 
                "\nDescuento: $" + Descuento +
                "\nIVA 13%: $" + Impuesto +
                "\nCompra con descuento: $" + TotalPagar);
    }
    
}