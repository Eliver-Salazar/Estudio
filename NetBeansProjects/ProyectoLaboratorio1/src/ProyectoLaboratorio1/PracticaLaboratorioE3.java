package ProyectoLaboratorio1;

import javax.swing.JOptionPane;


public class PracticaLaboratorioE3 {

    
    public static void main(String[] args) {
        int CantPasesEspeciales = Integer.parseInt(JOptionPane.showInputDialog(
        "Ingrese la cantidad de pases especiales:"));
        String DiaSemana = JOptionPane.showInputDialog(
        "Ingrese el día de la semana: ");

        double PrecioPaseEspecial = 12000;
        double Descuento = 0;

        // Aplica descuento del 20% por comprar 10 o más
        if (CantPasesEspeciales >= 10) {
            Descuento += 0.20 * (PrecioPaseEspecial * CantPasesEspeciales);
        }

        // Aplica descuento adicional del 5% si es Miércoles
        if (DiaSemana.equalsIgnoreCase("Miercoles")) {
            Descuento += 0.05 * (PrecioPaseEspecial * CantPasesEspeciales);
        }

        double PrecioFinal = (PrecioPaseEspecial * CantPasesEspeciales) - Descuento;

        JOptionPane.showMessageDialog(null,
                "Precio por pase especial: $" + PrecioPaseEspecial +
                        "\nDescuento: $" + Descuento +
                        "\nPrecio final: $" + PrecioFinal);
    }
}
