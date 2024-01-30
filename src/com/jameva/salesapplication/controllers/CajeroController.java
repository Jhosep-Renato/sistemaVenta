package com.jameva.salesapplication.controllers;

import com.jameva.salesapplication.models.compraproducto.ItemProducto;
import com.jameva.salesapplication.models.compraproducto.Producto;
import com.jameva.salesapplication.models.empleados.Cajero;
import com.jameva.salesapplication.models.empleados.Usuario;
import com.jameva.salesapplication.models.enums.TipoProducto;

public class CajeroController {

    private Cajero cajero;

    Producto[] productos = new Producto[]{new Producto("ASC1", "Pickeo", 14.2, TipoProducto.PICKEO),
    new Producto("ME1", "Mermelada de fresa", 7.80, TipoProducto.ALIMENTO),
    new Producto("ESC01", "EScoba para barrer", 25.2, TipoProducto.LIMPIEZA),
    new Producto("CERV0", "Cusqueña", 12.5, TipoProducto.LICOR)};

    public CajeroController(Usuario usuario) {
        cajero = new Cajero();
        cajero.setUsuario(usuario);
    }

    public boolean productosCarro(String codigo, int cantidad) {
        int conteo = 0;
        boolean encontrado = false;
        for (Producto p: productos) {
            if(p.getCodigo().equals(codigo)) {
                encontrado = true;
                break;
            }
            conteo++;
        }

        if(encontrado) {
            ItemProducto itemProducto = new ItemProducto(productos[conteo], cantidad);
            cajero.aniadirProducto(itemProducto);
        }
        return encontrado;
    }
}
