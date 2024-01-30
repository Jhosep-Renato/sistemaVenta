package com.jameva.salesapplication.models.empleados;

import com.jameva.salesapplication.models.enums.Rol;

public class Usuario {

    private String idUsuario;
    private String contrasenia;
    private Rol rol;
    private Empleado empleado;

    public Usuario(String idUsuario, String contrasenia, Rol rol) {
        this.idUsuario = idUsuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
