package casoprogramado2;

/**
 *
 * @author Eliver Salazar Campo
 */
//Clase Producto
public class Producto {
    private String codigo;
    private String nombre;
    private TipoProducto tipo;
    private double costoFabricacion;
    private double precioLista;

    // Constructor
    public Producto(String codigo, String nombre, TipoProducto tipo, double costoFabricacion, double precioLista) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.costoFabricacion = costoFabricacion;
        this.precioLista = precioLista;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }
}

