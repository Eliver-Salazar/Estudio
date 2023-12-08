package proyectoprogra;

import java.util.HashMap;
import java.util.Map;

public class UsuarioAuthenticator {
    private Map<String, Usuario> usuarios;

    public UsuarioAuthenticator() {
        this.usuarios = new HashMap<>();
    }

    public Usuario autenticarUsuario(String usuario, String password) {
        if (usuario == null || usuario.isEmpty() || password == null || password.isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario y la contraseña no pueden ser nulos o vacíos.");
        }

        Usuario usuarioEncontrado = usuarios.get(usuario);
        if (usuarioEncontrado != null && usuarioEncontrado.verificarPassword(password)) {
            return usuarioEncontrado;
        } else {
            throw new IllegalArgumentException("Nombre de usuario o contraseña incorrectos.");
        }
    }

    public void registrarUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("El usuario no puede ser nulo.");
        }

        if (!usuarios.containsKey(usuario.getUsuario())) {
            usuarios.put(usuario.getUsuario(), usuario);
        } else {
            throw new IllegalArgumentException("El nombre de usuario ya está registrado.");
        }
    }

    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }
}

