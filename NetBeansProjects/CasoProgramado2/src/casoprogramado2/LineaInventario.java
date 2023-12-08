package casoprogramado2;

/**
 *
 * @author Eliver Salazar Campo
 */
//Clase Linea Inventario
public class LineaInventario {
    private Producto producto;
    private int cantidad;

    // Constructor
    public LineaInventario(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Método Calcular Estimado Ganancia
    public double CalcularEstimadoGanancia() {
        return (cantidad * producto.getPrecioLista()) - (cantidad * producto.getCostoFabricacion());
    }
}

