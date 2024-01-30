package com.jameva.salesapplication.views;

import com.jameva.salesapplication.controllers.UsuarioController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JFrame implements ActionListener {
    private JTextField txtId;
    private JPasswordField txtContrasenia;
    private JButton btnIniciar;
    private JPanel panelLogin;

    public Login() {
        btnIniciar.addActionListener(this);
        setContentPane(panelLogin);
        setVisible(true);
        setSize(new Dimension(300, 300));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnIniciar) {
            String contrasenia = Arrays.toString(txtContrasenia.getPassword())
                    .replace("[", "").replace("]", "")
                    .replace(", ", "");
            UsuarioController usuarioControllers = new UsuarioController();

            if(usuarioControllers.verificarUsuario(txtId.getText(), contrasenia)) {

                JOptionPane.showMessageDialog(null, "Has iniciado sessión correctamente");
                InterfazPrincipal principal = new InterfazPrincipal(usuarioControllers.getEmpleados()[usuarioControllers.getContador()]);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese devuelta su contraseña");
            }
        }
    }
}
