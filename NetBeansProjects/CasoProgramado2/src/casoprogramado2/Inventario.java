package casoprogramado2;

/**
 *
 * @author Eliver Salazar Campo
 */
// Clase Inventario
public class Inventario {
    private Producto[] portafolioProductos;
    private LineaInventario[] lineasInventario;
    private CuatrimestreFiscal cuatrimestre;
    private double estimadoGanancia;
    private int contadorLineas;

    // Constructor
    public Inventario(CuatrimestreFiscal cuatrimestre, int maxProductos, int maxLineasInventario) {
        this.portafolioProductos = new Producto[maxProductos];
        this.lineasInventario = new LineaInventario[maxLineasInventario];
        this.cuatrimestre = cuatrimestre;
        this.estimadoGanancia = 0.0;
        this.contadorLineas = 0;
    }

    // Método Agrega Linea
    public void AgregaLinea(Producto producto, int cantidad) {
        if (contadorLineas < lineasInventario.length) {
            lineasInventario[contadorLineas++] = new LineaInventario(producto, cantidad);
        } else {
            System.out.println("No se puede agregar más líneas de inventario.");
        }
    }

    // Método Calcular Ganancia Periodo Fiscal
    public double CalcularGananciaPeriodoFiscal() {
        for (int i = 0; i < contadorLineas; i++) {
            estimadoGanancia += lineasInventario[i].CalcularEstimadoGanancia();
        }
        return estimadoGanancia;
    }

    // Getter para Cuatrimestre
    public CuatrimestreFiscal getCuatrimestre() {
        return cuatrimestre;
    }
}


