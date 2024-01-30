package com.jameva.salesapplication.models.compraproducto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarroCompra {

    private List<ItemProducto> lista;
    private Map<Producto, Double> productoPrecioTotal;

    public CarroCompra() {
        this.lista = new ArrayList<>();
        this.productoPrecioTotal = new HashMap<>();
    }

    public List<ItemProducto> getLista() {
        return lista;
    }

    public void setLista(ItemProducto itemProducto) {
        if (itemProducto != null) {
            lista.add(itemProducto);
        }
    }

    public Map<Producto, Double> getProductoPrecioTotal() {
        return productoPrecioTotal;
    }

    public double calcularTotal() {

        if (!lista.isEmpty()) {
            double total = 0;

            for (ItemProducto item: lista) {
                total += item.getCantidad() * item.getProducto().getPrecio();
                productoPrecioTotal.put(item.getProducto(), total);
            }
        }
        return 0;
    }


}
