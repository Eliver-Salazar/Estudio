package practicacaso4;

/**
 *
 * @author Eliver Salazar Campo
 */
import javax.swing.*;
import java.util.ArrayList;

public class Artista {
    private String nombre;
    private String apellido;
    private String fechaDeContrato;
    private GeneroMusica generoMusica;
    private PaisResidencia paisResidencia;
    private ArrayList<Album> listaAlbumes;
    private boolean activo;

    public Artista(String nombre, String apellido, String fechaDeContrato, GeneroMusica generoMusica, PaisResidencia paisResidencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeContrato = fechaDeContrato;
        this.generoMusica = generoMusica;
        this.paisResidencia = paisResidencia;
        this.listaAlbumes = new ArrayList<>();
        this.activo = true;
    }

    public void crearAlbum(String nombre, String nombreProductor, String fechaLanzamiento, int cantidadCanciones) {
        if (activo) {
            Album album = new Album(nombre, nombreProductor, fechaLanzamiento, cantidadCanciones);
            listaAlbumes.add(album);
        } else {
            JOptionPane.showMessageDialog(null, "El artista está inactivo. No se puede crear un álbum.");
        }
    }

    public void agregarCancionAlbum(int indiceAlbum, Cancion cancion, int posicion) {
        if (activo && indiceAlbum >= 0 && indiceAlbum < listaAlbumes.size()) {
            Album album = listaAlbumes.get(indiceAlbum);
            album.agregarCancion(cancion, posicion);
        } else {
            JOptionPane.showMessageDialog(null, "El artista está inactivo o el índice de álbum no es válido.");
        }
    }

    public void activar() {
        activo = true;
        JOptionPane.showMessageDialog(null, "Artista activado con éxito.");
    }

    public void inactivar() {
        activo = false;
        JOptionPane.showMessageDialog(null, "Artista inactivado con éxito.");
    }

    public int calcularLongitudAlbumes() {
        int totalDuracion = 0;
        for (Album album : listaAlbumes) {
            totalDuracion += calcularDuracionAlbum(album);
        }
        return totalDuracion;
    }

    private int calcularDuracionAlbum(Album album) {
        int duracion = 0;
        for (Cancion cancion : album.getListaCanciones()) {
            if (cancion != null) {
                duracion += cancion.getDuracionSegundos();
            }
        }
        return duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaDeContrato() {
        return fechaDeContrato;
    }

    public void setFechaDeContrato(String fechaDeContrato) {
        this.fechaDeContrato = fechaDeContrato;
    }

    public GeneroMusica getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(GeneroMusica generoMusica) {
        this.generoMusica = generoMusica;
    }

    public PaisResidencia getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(PaisResidencia paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    public ArrayList<Album> getListaAlbumes() {
        return listaAlbumes;
    }

    public void setListaAlbumes(ArrayList<Album> listaAlbumes) {
        this.listaAlbumes = listaAlbumes;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}


