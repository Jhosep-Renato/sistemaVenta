package com.jameva.salesapplication.models.compraproducto;

import com.jameva.salesapplication.models.enums.TipoProducto;

public class Producto {

    private String codigo;
    private String nombreProducto;
    private double precio;
    private TipoProducto tipo;

    public Producto(String codigo, String nombreProducto, double precio, TipoProducto tipo) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public String getCodigo() {
        return codigo;
    }
}
