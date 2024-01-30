package com.jameva.salesapplication.views;

import com.jameva.salesapplication.controllers.CajeroController;
import com.jameva.salesapplication.models.empleados.Empleado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistroCompra extends JFrame implements ActionListener {
    private JTextField txtcantidad;
    private JTextField txtcodigo;
    private JButton btnAñadirCarro;
    private JButton btnCarro;
    private JPanel panelCompra;
    private Empleado empleado;

    public RegistroCompra(Empleado empleado) {
        btnAñadirCarro.addActionListener(this);
        this.empleado = empleado;
        setContentPane(panelCompra);
        setVisible(true);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        CajeroController cajeroController = new CajeroController(empleado.getUsuario());

        if(e.getSource() == btnAñadirCarro) {

            String codigo = txtcodigo.getText();
            int cantidad;

            try {
                cantidad = Integer.parseInt(txtcantidad.getText());
            } catch (NumberFormatException nf) {
                cantidad = 0;
            }

            if(!codigo.isEmpty() && cantidad != 0) {
                boolean aniadido = cajeroController.productosCarro(codigo, cantidad);

                if(aniadido) {
                    JOptionPane.showMessageDialog(this, "Añadido al carro");
                    txtcodigo.setText("");
                    txtcantidad.setText("");
                }
            }
        }

        if(e.getSource() == btnCarro) {

        }
    }
}
