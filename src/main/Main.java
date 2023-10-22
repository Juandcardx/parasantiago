package main;

import model.Login;
import view.VentanaLogin;
import controller.Controlador;

public class Main {
    public static void main(String[] args) {
        Login miLogin = new Login();
        VentanaLogin miVentanaLogin = new VentanaLogin();
        VentanaLogin.getInstance().showLoginWindow();
        new Controlador(miVentanaLogin, miLogin);
    }
}
