package Semana2;

import javax.swing.JOptionPane;

public class Ejercicio3S2 {


    public static void main(String[] args) {
        int Antiguedad;
        int HorasLaboradasPorSemana;
        double PrecioPorHora;
        double SalarioBruto;
        
        // Se solicitan los años de antigüedad, horas laboradas y precio por hora
        Antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese años de antigüedad: "));
        HorasLaboradasPorSemana = Integer.parseInt(JOptionPane.showInputDialog("Ingrese horas laboradas por semana: "));
        PrecioPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio por hora: "));

        // Se calculo el salario bruto
        SalarioBruto = HorasLaboradasPorSemana * 4 * PrecioPorHora;

        // Se aplica el bono si tiene más de 10 años de antigüedad
        if (Antiguedad > 10) {
            SalarioBruto *= 1.20;  // Bono del 20%
        }

        // Se aplica deducciones según el salario bruto
        if (SalarioBruto > 2000) {
            SalarioBruto *= 0.85;  // Deducción del 15%
        } else if (SalarioBruto > 1000) {
            SalarioBruto *= 0.90;  // Deducción del 10%
        }

        // Mostrar salario neto final al usuario
        JOptionPane.showMessageDialog(null, "Salario neto final: $" + SalarioBruto);
    
    }
    
}