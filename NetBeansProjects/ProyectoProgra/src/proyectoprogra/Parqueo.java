package proyectoprogra;


import javax.swing.JOptionPane;

public class Parqueo {
    private Espacio[] espacios;
    private int espaciosRegistrados;
    
    public Parqueo(Espacio[] espacios, int espaciosRegistrados) {
        this.espacios = espacios;
        this.espaciosRegistrados = espaciosRegistrados;
    }

    // Método para agregar un nuevo espacio
    public void agregarEspacio(String tipo, int capacidad) {
        // Verificar si hay espacios disponibles
        if (espaciosRegistrados < espacios.length) {
            Espacio nuevoEspacio = new Espacio(espaciosRegistrados + 1, tipo, capacidad);
            espacios[espaciosRegistrados] = nuevoEspacio;
            espaciosRegistrados++;
            ajustarNumeracion();
            JOptionPane.showMessageDialog(null, "Espacio agregado correctamente","Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Se ha alcanzado la capacidad máxima de espacios.",
                  "Capacidad Máxima Alcanzada", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Método para cambiar el tipo de un espacio
    public void cambiarTipoEspacio(int idEspacio, String nuevoTipo) {
        Espacio espacio = encontrarEspacioPorId(idEspacio);
        if (espacio != null) {
            espacio.editarEspacio(nuevoTipo, espacio.getCapacidad());
            JOptionPane.showMessageDialog(null, "Tipo de espacio modificado correctamente","Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Espacio no encontrado.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para eliminar un espacio
    public void eliminarEspacio(int idEspacio) {
        Espacio espacio = encontrarEspacioPorId(idEspacio);
        if (espacio != null) {
            espacio.inactivarEspacio();
            espaciosRegistrados--;
            ajustarNumeracion();
            JOptionPane.showMessageDialog(null, "Espacio eliminado correctamente","Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Espacio no encontrado.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para encontrar un espacio por su identificador
    private Espacio encontrarEspacioPorId(int idEspacio) {
        for (int i = 0; i < espaciosRegistrados; i++) {
            if (espacios[i].getIdentificador() == idEspacio) {
                return espacios[i];
            }
        }
        return null;
    }

    // Método para ajustar la numeración de los espacios
    private void ajustarNumeracion() {
        // Ajustar la numeración del resto de espacios
        for (int i = espaciosRegistrados - 1; i >= 0; i--) {
            Espacio espacioActual = espacios[i];
            if (espacioActual.getIdentificador() > espaciosRegistrados) {
                espacioActual.setIdentificador(espacioActual.getIdentificador() + 1);
            }
        }
    }
}

