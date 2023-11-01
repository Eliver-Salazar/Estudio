/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprogra;

/**
 *
 * @author Eliver Salazar Campo
 */
public class UsuarioAuthenticator {
    private Usuario[] usuarios = new Usuario[100];
    private int usuariosRegistrados = 0;

    public Usuario autenticarUsuario(String usuario, String password) {
        for (int i = 0; i < usuariosRegistrados; i++) {
            if (usuarios[i].getUsuario().equals(usuario)) {
                if (usuarios[i].verificarPassword(password)) {
                    return usuarios[i];
                }
            }
        }
        return null;
    }
}
