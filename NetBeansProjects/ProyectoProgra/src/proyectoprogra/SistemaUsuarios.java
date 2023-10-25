/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogra;

/**
 *
 * @author Eliver Salazar Campo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaUsuarios extends JFrame {
    private Usuario[] usuarios = new Usuario[100]; // Array para almacenar usuarios, solo se pueden 100 usuarios
    private int usuariosRegistrados = 0; // Contador de usuarios registrados

    public SistemaUsuarios() {
        setTitle("Sistema de Usuarios");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear paneles para registro e inicio de sesión
        JPanel registroPanel = new JPanel();
        JPanel loginPanel = new JPanel();
        registroPanel.setLayout(new GridLayout(0, 2)); // Dos columnas
        loginPanel.setLayout(new GridLayout(0, 2)); // Dos columnas

        // Componentes para el registro de usuarios
        JTextField nombreField = new JTextField(20);
        JTextField apellidosField = new JTextField(20);
        JTextField usuarioField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JTextField estadoField = new JTextField(20);
        JTextField correoField = new JTextField(20);
        JButton registroButton = new JButton("Registrar");

        // Componentes para el inicio de sesión
        JTextField loginUsuarioField = new JTextField(20);
        JPasswordField loginPasswordField = new JPasswordField(20);
        JButton loginButton = new JButton("Iniciar Sesión");

        // Botón para cambiar al formulario de inicio de sesión desde el registro
        JButton switchToLoginButton = new JButton("Iniciar Sesión");

        // Botón para cambiar al formulario de registro desde el inicio de sesión
        JButton switchToRegistroButton = new JButton("Registrar");

        // Agregar componentes al panel de registro
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
        registroPanel.add(new JLabel("")); // Espacio en blanco para alinear el botón
        registroPanel.add(registroButton);
        registroPanel.add(new JLabel("")); // Espacio en blanco
        registroPanel.add(switchToLoginButton);        

        // Agregar componentes al panel de inicio de sesión
        loginPanel.add(new JLabel("Usuario:"));
        loginPanel.add(loginUsuarioField);
        loginPanel.add(new JLabel("Contraseña:"));
        loginPanel.add(loginPasswordField);
        loginPanel.add(new JLabel("")); // Espacio en blanco para alinear el botón
        loginPanel.add(loginButton);
        loginPanel.add(new JLabel("")); // Espacio en blanco
        loginPanel.add(switchToRegistroButton);

        // Agregar los paneles al marco con el CardLayout
        setLayout(new CardLayout());
        add(registroPanel, "registro");
        add(loginPanel, "login");
        
        // Botón para consultar usuarios
JButton consultarUsuariosButton = new JButton("Consultar Usuarios");
registroPanel.add(new JLabel("")); // Espacio en blanco
registroPanel.add(consultarUsuariosButton);


        // Acción al presionar el botón de consultar usuarios
        consultarUsuariosButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
        // Mostrar la lista de usuarios registrados en una nueva ventana o diálogo
        JFrame listaUsuariosFrame = new JFrame("Lista de Usuarios");
        JTextArea listaUsuariosTextArea = new JTextArea();
        listaUsuariosTextArea.setEditable(false);

        for (int i = 0; i < usuariosRegistrados; i++) {
            Usuario usuario = usuarios[i];
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
        });


        // Acción al presionar el botón de registro
            registroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Capturar los datos del usuario y registrarlos
                String nombre = nombreField.getText();
                String apellidos = apellidosField.getText();
                String nuevoUsuario = usuarioField.getText();
                String newPassword = new String(passwordField.getPassword());
                String estado = estadoField.getText();
                String correo = correoField.getText();

                // Crear un nuevo usuario
                Usuario nuevoUsuarioObj = new Usuario(nombre, apellidos, nuevoUsuario, newPassword, estado, correo);

                // Agregar el nuevo usuario al array de usuarios
                if (usuariosRegistrados < usuarios.length) {
                    usuarios[usuariosRegistrados] = nuevoUsuarioObj;
                    usuariosRegistrados++;

                // Limpia los campos después del registro
                nombreField.setText("");
                apellidosField.setText("");
                usuarioField.setText("");
                passwordField.setText("");
                estadoField.setText("");
                correoField.setText("");
            } else {
                    // Manejar el caso de superar la capacidad máxima de usuarios
                }
            }
        });
        
        // Acción al presionar el botón de inicio de sesión
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                // Capturar los datos del inicio de sesión
                String usuario = loginUsuarioField.getText();
                String password = new String(loginPasswordField.getPassword());
                
                // Verificar las credenciales del usuario y realizar la autenticación
                for (int i = 0; i < usuariosRegistrados; i++) {
                    if (usuarios[i].getUsuario().equals(usuario) && usuarios[i].getPassword().equals(password)) {
                        // Usuario autenticado
                        Usuario usuarioAutenticado = usuarios[i];
                        
                        // Limpia los campos después del inicio de sesión
                        loginUsuarioField.setText("");
                        loginPasswordField.setText("");
                        // Realiza acciones específicas al autenticar, como mostrar un mensaje o redirigir
                        // a otra ventana, según tus necesidades.
                        return;
                    }

                }
            }
        });

        // Acción al presionar el botón para cambiar al formulario de inicio de sesión desde el registro
        switchToLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) getContentPane().getLayout();
                layout.show(getContentPane(), "login"); // Mostrar el panel de inicio de sesión
            }
        });

        // Acción al presionar el botón para cambiar al formulario de registro desde el inicio de sesión
        switchToRegistroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout layout = (CardLayout) getContentPane().getLayout();
                layout.show(getContentPane(), "registro"); // Mostrar el panel de registro
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SistemaUsuarios().setVisible(true);
            }
        });
    }
}
