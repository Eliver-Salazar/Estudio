package ProyectoLaboratorio1;

import javax.swing.JOptionPane;


public class PracticaLaboratorioE1 {

    
    public static void main(String[] args) {
        double SalarioMensual = Double.parseDouble(JOptionPane.showInputDialog(
        "Ingrese su salario actual mensual"));
        
        double Subsidio;
        
        //Comparaciones de salarios para aplicar descuento
        if (SalarioMensual >= 300000 && SalarioMensual <= 500000){
            Subsidio = SalarioMensual * 0.16;
        }
        else if (SalarioMensual >=501000 && SalarioMensual <= 700000){
            Subsidio = SalarioMensual * 0.12;
        }
        else if (SalarioMensual >=701000 && SalarioMensual <= 1000000){
            Subsidio = SalarioMensual * 0.10;
        }
        else if (SalarioMensual > 1000000){
            Subsidio = SalarioMensual * 0.08;
        }
        else{
            Subsidio = 0;
        }
        
        double SalarioAnual = (SalarioMensual * 12) +  Subsidio;
        
        JOptionPane.showMessageDialog(null,"Monto Subsidio: $" + Subsidio + 
        "\nNuevo salario anual: $" + SalarioAnual);
    }
    
}
