package com.jameva.salesapplication.models.empleados;

import com.jameva.salesapplication.models.compraproducto.CarroCompra;
import com.jameva.salesapplication.models.compraproducto.ItemProducto;
import com.jameva.salesapplication.models.compraproducto.Producto;

import java.util.Map;

public class Cajero implements OperacionesEmpleados {

    private CarroCompra carroCompra;
    private Usuario usuario;

    public Cajero() {
        this.carroCompra = new CarroCompra();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void realizarVenta(Cliente cliente) {

        Map<Producto, Double> productoPrecioTotal = carroCompra.getProductoPrecioTotal();

        if (!productoPrecioTotal.isEmpty()) {

            productoPrecioTotal.forEach((producto, precio) -> {
                System.out.println("Nombre Producto: " + producto.getNombreProducto());
                System.out.println("Precio * Cantidad: " + precio);
            });
        }
        else {
            System.out.println("No hay ningun producto para realizar la venta");
        }
    }

    public void aniadirProducto(ItemProducto itemProducto) {
        if(itemProducto.getProducto() != null && itemProducto.getCantidad() != 0) {
            carroCompra.setLista(itemProducto);
            System.out.println("Total de carro Compra" + carroCompra.calcularTotal());
        }
    }

    @Override
    public void reporte() {

    }


}
