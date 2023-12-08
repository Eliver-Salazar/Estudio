package proyectoprogra;


import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;

public class Parqueo {
    private Espacio[] espacios;
    private int espaciosRegistrados;
    private Map<LocalDate, Double> gananciasPorDia;
    private RegistroParqueo[] registros;
    private int numRegistros;

    public Parqueo(int maxEspacios) {
        this.espacios = new Espacio[maxEspacios];
        this.espaciosRegistrados = 0;
        this.gananciasPorDia = new HashMap<>();
        this.registros = new RegistroParqueo[100];
        this.numRegistros = 0;
    }
    
    public void agregarRegistro(RegistroParqueo registro) {
        int numRegistro = 0;
        if(numRegistro < registros.length){
            registros[numRegistros] = registro;
            numRegistros++;        
        } else {
            System.out.println("Se ha alcanzado la capacidad máxima de registros.");
        }
    }
    
    public RegistroParqueo[] getRegistros() {
        int numRegistro = 0;
        RegistroParqueo[] registroActivos = new RegistroParqueo[numRegistro];
        Object registrosActivos = null;
        System.arraycopy(registros, 0, registrosActivos, 0, numRegistros);
        return (RegistroParqueo[]) registrosActivos;
    }
   
    private Espacio encontrarEspacioPorId(int idEspacio) {
        for (int i = 0; i < espaciosRegistrados; i++) {
            if (espacios[i].getIdentificador() == idEspacio) {
                return espacios[i];
            }
        }
        return null;
    }

    private void ajustarNumeracion() {
        for (int i = espaciosRegistrados - 1; i >= 0; i--) {
            Espacio espacioActual = espacios[i];
            if (espacioActual.getIdentificador() > espaciosRegistrados) {
                espacioActual.setIdentificador(espacioActual.getIdentificador() + 1);
            }
        }
    }

    public void agregarEspacio(String tipo, int capacidad) {
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

    public void cambiarTipoEspacio(int idEspacio, String nuevoTipo) throws Exception {
        Espacio espacio = encontrarEspacioPorId(idEspacio);
        if (espacio != null) {
            espacio.editarEspacio(nuevoTipo, espacio.getCapacidad());
            JOptionPane.showMessageDialog(null, "Tipo de espacio modificado correctamente","Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Espacio no encontrado.","Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarEspacio(int idEspacio) throws Exception {
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
    
    public RegistroParqueo crearRegistroParqueo(String numeroPlaca, Usuario cliente, LocalDateTime horaIngreso) {
        RegistroParqueo nuevoRegistro = new RegistroParqueo(numeroPlaca, cliente, horaIngreso);
        JOptionPane.showMessageDialog(null, "Registro de parqueo creado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        return nuevoRegistro;
    }

    public Factura finalizarRegistroParqueo(RegistroParqueo registro) {
        registro.finalizarRegistro();
        Factura factura = registro.generarFactura();
        agregarGananciasPorDia(registro.getHoraIngreso().toLocalDate(), factura.getTotalPagar());
        JOptionPane.showMessageDialog(null, "Registro de parqueo finalizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        return factura;
    }

    private void agregarGananciasPorDia(LocalDate fecha, double monto) {
        gananciasPorDia.put(fecha, gananciasPorDia.getOrDefault(fecha, 0.0) + monto);
    }

    public LocalDate obtenerDiaMaxGanancia() {
        LocalDate diaMaxGanancia = null;
        double maxGanancia = 0.0;

        for (Map.Entry<LocalDate, Double> entry : gananciasPorDia.entrySet()) {
            if (entry.getValue() > maxGanancia) {
                maxGanancia = entry.getValue();
                diaMaxGanancia = entry.getKey();
            }
        }

        return diaMaxGanancia;
    }

    public Espacio[] getEspacios() {
        return espacios;
    }

    public int getEspaciosRegistrados() {
        return espaciosRegistrados;
    }

    public Map<LocalDate, Double> getGananciasPorDia() {
        return gananciasPorDia;
    }
}


