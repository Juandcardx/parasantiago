package controller;

import model.Login;
import view.VentanaLogin;
import view.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private VentanaLogin miVentanaLogin;
    private Login miLogin;

    public Controlador(VentanaLogin miVentanaLogin, Login miLogin) {
        this.miVentanaLogin = miVentanaLogin;
        this.miLogin = miLogin;
        this.miVentanaLogin.buttonAction1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        if (comando.equals("accionLogin")) {
            try {
                if (miLogin.loginUsuario(miVentanaLogin.txtUsuario.getText(),
                        miVentanaLogin.txtPassword.getPassword())) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso!");
                    VentanaMenu miVentanaMenu = new VentanaMenu();
                    miVentanaMenu.setVisible(true);
                    // miVentanaMenu.miSalir.addActionListener(this);
                    // miVentanaMenu.miAcercaDe.addActionListener(this);
                } else {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión fallido!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (comando.equals("salirVentana")) {
            System.exit(0);
        }
    }
}
