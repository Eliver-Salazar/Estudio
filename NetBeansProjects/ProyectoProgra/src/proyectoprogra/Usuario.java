package proyectoprogra;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String usuario;
    private String passwordHash;
    private String estado;
    private String correo;
    private Espacio espacioOcupado;

    public Usuario(String nombre, String apellidos, String usuario, String password, String estado, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        setPassword(password);
        this.estado = estado;
        this.correo = correo;
    }

    private void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.passwordHash = hashPassword(password);
        } else {
            throw new IllegalArgumentException("La contraseña no puede ser nula o vacía.");
        }
    }

    public boolean verificarPassword(String password) {
        return passwordHash.equals(hashPassword(password));
    }

    public void desocuparEspacio() throws Exception {
        if (espacioOcupado != null) {
            espacioOcupado.desocupar();
            espacioOcupado = null;
        } else {
            throw new IllegalStateException("No hay espacio ocupado para desocupar.");
        }
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder(2 * encodedHash.length);

            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEstado() {
        return estado;
    }

    public String getCorreo() {
        return correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public Espacio getEspacioOcupado() {
        return espacioOcupado;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setEspacioOcupado(Espacio espacioOcupado) {
        this.espacioOcupado = espacioOcupado;
    }
}


