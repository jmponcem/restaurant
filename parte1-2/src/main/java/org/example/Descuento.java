package org.example;

import java.util.List;

public class Descuento {
    public static double DescuentoPlatos(List<Integer> detalle) {
        int cantidadPlatos = 0;
        for(int cantidad : detalle){
            cantidadPlatos += cantidad;
        }
        double porcentajeDescuento = 0;
        if (cantidadPlatos <= 5) {
            porcentajeDescuento = 0;
        } else if (cantidadPlatos > 5 && cantidadPlatos < 10) {
            porcentajeDescuento = 0.03;
        } else if (cantidadPlatos >= 10 && cantidadPlatos < 15) {
            porcentajeDescuento = 0.05;
        } else if (cantidadPlatos >= 15 && cantidadPlatos <= 30) {
            porcentajeDescuento = 0.3;
        }
        return porcentajeDescuento;

    }

    public static double DescuentoPlatosMesas(int cantidadPlatos, int capacidadMesa) {
        double porcentajeDescuento = 0.0;

        if (cantidadPlatos > 5 && capacidadMesa < 4) {
            porcentajeDescuento = 0.15;
        } else if (cantidadPlatos >= 5 && cantidadPlatos <= 15 && capacidadMesa >= 4 && capacidadMesa <= 6) {
            porcentajeDescuento = 0.20;
        } else if (capacidadMesa > 6 && cantidadPlatos > 15) {
            porcentajeDescuento = 0.30;
        } else if (capacidadMesa == 2 && cantidadPlatos > 5) {
            porcentajeDescuento = 0.15;
        }else if (cantidadPlatos < 5 && capacidadMesa <= 4)
            porcentajeDescuento = 0;

        return porcentajeDescuento;
    }
}
