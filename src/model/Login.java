package model;

public class Login {
    public boolean loginUsuario(String usuario, char[] contrasena) {
        if (usuario.equals("admin") && new String(contrasena).equals("12345"))
            return true;
        else if ((usuario.equals("jesus") && new String(contrasena).equals("00000")))
            return true;
        else
            return false;
    }
}
