/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

/**
 *
 * @author Eliver Salazar Campo
 */
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

    public Usuario(String nombre, String apellidos, String usuario, String password, String estado, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        setPassword(password);
        this.estado = estado;
        this.correo = correo;
    }

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

    public boolean verificarPassword(String password) {
        String hashedPassword = hashPassword(password);
        return passwordHash.equals(hashedPassword);
    }

    private void setPassword(String password) {
        passwordHash = hashPassword(password);
    }

    public String getPasswordHash() {
        return passwordHash;
    }
    

    private String hashPassword(String password) {
    try {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(password.getBytes(StandardCharsets.UTF_8));  // Use StandardCharsets.UTF_8 for consistent character encoding.
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
        e.printStackTrace();
        return null;
    }
}

    //String getNombre() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

   // String getApellidos() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    //String getEstado() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    //String getCorreo() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }
}

