package proyectoprogra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

public class SistemaUsuarios extends JFrame {
    private Map<String, Usuario> usuarios;
    private Map<String, Espacio> espacios;
    private Parqueo parqueo;
    
    private JTextField loginUsuarioField;
    private JPasswordField loginPasswordField;

    public SistemaUsuarios() {
        setTitle("Sistema de Usuarios");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        usuarios = new HashMap<>();
        espacios = new HashMap<>();
        parqueo = new Parqueo(10);

        JPanel registroPanel = new JPanel();
        JPanel loginPanel = new JPanel();
        registroPanel.setLayout(new GridLayout(0, 2)); 
        loginPanel.setLayout(new GridLayout(0, 2)); 

        JTextField nombreField = new JTextField(20);
        JTextField apellidosField = new JTextField(20);
        JTextField usuarioField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JTextField estadoField = new JTextField(20);
        JTextField correoField = new JTextField(20);
        JButton registroButton = new JButton("Registrar");

        loginUsuarioField = new JTextField(20);
        loginPasswordField = new JPasswordField(20);
        JButton loginButton = new JButton("Iniciar Sesión");

        JButton switchToLoginButton = new JButton("Iniciar Sesión");
        JButton switchToRegistroButton = new JButton("Registrar");

        registroPanel.add(new JLabel("Nombre:"));
        registroPanel.add(nombreField);
        registroPanel.add(new JLabel("Apellidos:"));
        registroPanel.add(apellidosField);
        registroPanel.add(new JLabel("Usuario:"));
        registroPanel.add(usuarioField);
        registroPanel.add(new JLabel("Contraseña:"));
        registroPanel.add(passwordField);
        registroPanel.add(new JLabel("Estado (Activo/Inactivo):"));
        registroPanel.add(estadoField);
        registroPanel.add(new JLabel("Correo:"));
        registroPanel.add(correoField);
        registroPanel.add(new JLabel("")); 
        registroPanel.add(registroButton);
        registroPanel.add(new JLabel("")); 
        registroPanel.add(switchToLoginButton);

        loginPanel.add(new JLabel("Usuario:"));
        loginPanel.add(loginUsuarioField);
        loginPanel.add(new JLabel("Contraseña:"));
        loginPanel.add(loginPasswordField);
        loginPanel.add(new JLabel("")); 
        loginPanel.add(loginButton);
        loginPanel.add(new JLabel("")); 
        loginPanel.add(switchToRegistroButton);

        setLayout(new CardLayout());
        add(registroPanel, "registro");
        add(loginPanel, "login");

        JButton consultarUsuariosButton = new JButton("Consultar Usuarios");
        registroPanel.add(new JLabel("")); 
        registroPanel.add(consultarUsuariosButton);

        JButton agregarEspacioEspecialButton = new JButton("Agregar Espacio Especial");
        loginPanel.add(new JLabel("")); 
        loginPanel.add(agregarEspacioEspecialButton);

        JButton crearRegistroParqueoButton = new JButton("Crear Registro de Parqueo");
        registroPanel.add(crearRegistroParqueoButton);

        JButton finalizarRegistroParqueoButton = new JButton("Finalizar Registro de Parqueo");
        loginPanel.add(finalizarRegistroParqueoButton);

        JButton gestionarEspaciosButton = new JButton("Gestionar Espacios");
        loginPanel.add(gestionarEspaciosButton);

        agregarEspacioEspecialButton.addActionListener((ActionEvent e) -> agregarEspacioEspecial());

        consultarUsuariosButton.addActionListener((ActionEvent e) -> consultarUsuarios());

        registroButton.addActionListener((ActionEvent e) -> registrarUsuario(nombreField, apellidosField, usuarioField, passwordField, estadoField, correoField));

        loginButton.addActionListener((ActionEvent e) -> autenticarUsuario());

        switchToLoginButton.addActionListener((ActionEvent e) -> cambiarFormulario("login"));

        switchToRegistroButton.addActionListener((ActionEvent e) -> cambiarFormulario("registro"));

        finalizarRegistroParqueoButton.addActionListener((ActionEvent e) -> finalizarRegistroParqueo());

        gestionarEspaciosButton.addActionListener((ActionEvent e) -> gestionarEspacios());

        crearRegistroParqueoButton.addActionListener((ActionEvent e) -> {
            try {
                crearRegistroParqueo();
            } catch (Exception ex) {
                Logger.getLogger(SistemaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void cambiarFormulario(String formulario) {
        CardLayout layout = (CardLayout) getContentPane().getLayout();
        layout.show(getContentPane(), formulario); 
    }

    private void registrarUsuario(JTextField nombreField, JTextField apellidosField, JTextField usuarioField, JPasswordField passwordField, JTextField estadoField, JTextField correoField) {
        String nombre = nombreField.getText();
        String apellidos = apellidosField.getText();
        String usuario = usuarioField.getText();
        String password = new String(passwordField.getPassword());
        String estado = estadoField.getText();
        String correo = correoField.getText();

        Usuario nuevoUsuario = new Usuario(nombre, apellidos, usuario, password, estado, correo);
        usuarios.put(usuario, nuevoUsuario);

        nombreField.setText("");
        apellidosField.setText("");
        usuarioField.setText("");
        passwordField.setText("");
        estadoField.setText("");
        correoField.setText("");

        JOptionPane.showMessageDialog(null, "Usuario registrado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void autenticarUsuario() {
        String usuario = loginUsuarioField.getText();
        String password = new String(loginPasswordField.getPassword());

        Usuario usuarioAutenticado = usuarios.get(usuario);
        if (usuarioAutenticado != null && usuarioAutenticado.verificarPassword(password)) {
            JOptionPane.showMessageDialog(null, "Sesión iniciada", "Inicio de Sesión Exitoso", JOptionPane.INFORMATION_MESSAGE);
            loginUsuarioField.setText("");
            loginPasswordField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Por favor, inténtelo de nuevo.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
            loginPasswordField.setText("");
        }
    }

    private void consultarUsuarios() {
        JFrame listaUsuariosFrame = new JFrame("Lista de Usuarios");
        JTextArea listaUsuariosTextArea = new JTextArea();
        listaUsuariosTextArea.setEditable(false);

        for (Usuario usuario : usuarios.values()) {
            listaUsuariosTextArea.append("Nombre: " + usuario.getNombre() + "\n");
            listaUsuariosTextArea.append("Apellidos: " + usuario.getApellidos() + "\n");
            listaUsuariosTextArea.append("Usuario: " + usuario.getUsuario() + "\n");
            listaUsuariosTextArea.append("Estado: " + usuario.getEstado() + "\n");
            listaUsuariosTextArea.append("Correo: " + usuario.getCorreo() + "\n");
            listaUsuariosTextArea.append("----------------------------------------\n");
        }

        JScrollPane scrollPane = new JScrollPane(listaUsuariosTextArea);
        listaUsuariosFrame.add(scrollPane);
        listaUsuariosFrame.setSize(400, 300);
        listaUsuariosFrame.setVisible(true);
    }

    private void agregarEspacioEspecial() {
        String tipo = JOptionPane.showInputDialog(null, "Tipo de parqueo especial:");
        try {
            int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Capacidad del parqueo especial:"));
            Espacio nuevoEspacio = new Espacio(espacios.size() + 1, tipo, capacidad);
            espacios.put(tipo, nuevoEspacio);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una capacidad válida.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void crearRegistroParqueo() throws Exception {
        String numeroPlaca = JOptionPane.showInputDialog(null, "Número de Placa:");
        String nombreUsuario = JOptionPane.showInputDialog(null, "Nombre de Usuario:");
        Usuario cliente = usuarios.get(nombreUsuario);
        Espacio espacio = espacios.get("Espacio 1");

        if (cliente != null && espacio != null) {
            espacio.ocuparEspacio(cliente);
            LocalDateTime horaIngreso = LocalDateTime.now();
            RegistroParqueo registro = new RegistroParqueo(numeroPlaca, cliente, espacio, horaIngreso);
            JOptionPane.showMessageDialog(null, "Registro de parqueo creado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No hay espacios disponibles o el usuario no está registrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void finalizarRegistroParqueo() {
        int idEspacio = Integer.parseInt(JOptionPane.showInputDialog(null, "ID del Espacio Ocupado:"));
        RegistroParqueo registro = obtenerRegistroPorEspacio(idEspacio); 
        if (registro != null) {
            registro.finalizarRegistro();
            Factura factura = registro.generarFactura();
            if (factura != null) {
                JOptionPane.showMessageDialog(null, "Factura generada:\n" + factura.toString(), "Factura Generada", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Registro no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private RegistroParqueo obtenerRegistroPorEspacio(int idEspacio) {
        for (RegistroParqueo registro : parqueo.getRegistros()) {
            if (registro.getEspacio().getIdentificador() == idEspacio) {
                return registro;
            }
        }
        return null;
    }

    private void gestionarEspacios() {
        JFrame gestionarEspaciosFrame = new JFrame("Gestionar Espacios");
        gestionarEspaciosFrame.setLayout(new GridLayout(0, 2));

        JTextField idEspacioField = new JTextField(5);
        JTextField tipoEspacioField = new JTextField(20);
        JTextField capacidadEspacioField = new JTextField(5);
        JButton agregarEspacioButton = new JButton("Agregar Espacio");

                gestionarEspaciosFrame.add(new JLabel("ID del Espacio:"));
        gestionarEspaciosFrame.add(idEspacioField);
        gestionarEspaciosFrame.add(new JLabel("Tipo del Espacio:"));
        gestionarEspaciosFrame.add(tipoEspacioField);
        gestionarEspaciosFrame.add(new JLabel("Capacidad del Espacio:"));
        gestionarEspaciosFrame.add(capacidadEspacioField);
        gestionarEspaciosFrame.add(new JLabel("")); 
        gestionarEspaciosFrame.add(agregarEspacioButton);

        agregarEspacioButton.addActionListener((ActionEvent e) -> {
            try {
                int idEspacio = Integer.parseInt(idEspacioField.getText());
                String tipoEspacio = tipoEspacioField.getText();
                int capacidadEspacio = Integer.parseInt(capacidadEspacioField.getText());

                Espacio nuevoEspacio = new Espacio(idEspacio, tipoEspacio, capacidadEspacio);
                espacios.put(tipoEspacio, nuevoEspacio);

                idEspacioField.setText("");
                tipoEspacioField.setText("");
                capacidadEspacioField.setText("");

                JOptionPane.showMessageDialog(null, "Espacio agregado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese datos válidos.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        });

        gestionarEspaciosFrame.setSize(400, 200);
        gestionarEspaciosFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SistemaUsuarios().setVisible(true));
    }
    
}




