package com.jameva.salesapplication.controllers;

import com.jameva.salesapplication.models.empleados.Empleado;
import com.jameva.salesapplication.models.empleados.Usuario;
import com.jameva.salesapplication.models.enums.Rol;

public class UsuarioController {

    private Empleado[] empleados;
    private int contador = 0;

    public UsuarioController() {
        Empleado empleado = new Empleado("Jhosep", "Pantoja",
                new Usuario("12345", "123", Rol.CAJERO));
        Empleado empleado2 = new Empleado("Lisbet", "Robinson",
                new Usuario("6789", "098", Rol.CAJERO));

        this.empleados = new Empleado[]{empleado2, empleado};
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getContador() {
        return contador;
    }

    public boolean verificarUsuario(String id, String password) {

        boolean verificar = false;

        for(Empleado e: empleados) {
            Usuario u = e.getUsuario();
            if(u.getIdUsuario().equals(id) && u.getContrasenia().equals(password)) {
                verificar = true;
                break;
            }
            contador++;
        }
        return verificar;
    }
}
