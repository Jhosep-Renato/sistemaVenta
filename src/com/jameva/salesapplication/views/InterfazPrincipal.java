package com.jameva.salesapplication.views;

import com.jameva.salesapplication.models.empleados.Empleado;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazPrincipal extends JFrame implements ActionListener {
    private JButton btnCompras;
    private JButton btnReporte;
    private JTextArea textArea1;
    private JPanel panelPrincipal;
    private Empleado empleado;

    public InterfazPrincipal(Empleado empleado) {
        this.empleado = empleado;
        btnCompras.addActionListener(this);
        setContentPane(panelPrincipal);
        setVisible(true);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(this, "Hola: " + empleado.getNombre());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnCompras) {
            RegistroCompra r = new RegistroCompra(empleado);
            dispose();
        }
        if(e.getSource() == btnReporte) {

        }
    }
}
