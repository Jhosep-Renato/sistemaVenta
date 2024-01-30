package com.jameva.salesapplication.models.compraproducto;

public class ItemProducto {

    private Producto producto;
    private int cantidad;

    public ItemProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
