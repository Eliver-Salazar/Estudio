package casoprogramado2;
/**
 *
 * @author Eliver Salazar Campo
 */
import javax.swing.JOptionPane;
//Clase Main

public class Main {
    public static void main(String[] args) {
        // Enumeradores
        TipoProducto tipoHotel = TipoProducto.HOTEL;
        TipoProducto tipoRestaurante = TipoProducto.RESTAURANTE;

        CuatrimestreFiscal q1 = CuatrimestreFiscal.Q1;
        CuatrimestreFiscal q2 = CuatrimestreFiscal.Q2;

        // Arreglo de objetos Producto
        Producto[] productos = {
            new Producto("P001", "Sabanas", tipoHotel, 10.0, 20.0),
            new Producto("P002", "Cubiertos", tipoRestaurante, 15.0, 25.0),
            new Producto("P003", "Almohadas", tipoHotel, 8.0, 18.0),
            new Producto("P004", "Platos", tipoRestaurante, 12.0, 22.0)
        };

        // Arreglo de objetos Inventario
        Inventario[] inventarios = {
            new Inventario(q1, 5, 10),  // Tamaño máximo de productos: 5, Tamaño máximo de líneas de inventario: 10
            new Inventario(q2, 5, 10)
        };

        // Agrega líneas de inventario a cada uno de los inventarios, con productos diferentes.
        inventarios[0].AgregaLinea(productos[0], 5);
        inventarios[0].AgregaLinea(productos[1], 8);

        inventarios[1].AgregaLinea(productos[2], 12);
        inventarios[1].AgregaLinea(productos[3], 10);

        // Calcule la ganancia del periodo para cada uno de los inventarios y muestre el resultado en JOptionPane.
        for (Inventario inventario : inventarios) {
            double ganancia = inventario.CalcularGananciaPeriodoFiscal();
            JOptionPane.showMessageDialog(null, "Ganancia para el Cuatrimestre " + inventario.getCuatrimestre() + ": $" + ganancia);
        }
    }
}

