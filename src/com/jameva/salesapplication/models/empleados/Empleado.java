package com.jameva.salesapplication.models.empleados;

public class Empleado {

    protected String nombre;
    protected String apellido;
    protected Usuario usuario;

    public Empleado(String nombre, String apellido, Usuario usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
