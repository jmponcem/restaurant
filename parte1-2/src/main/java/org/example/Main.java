package org.example;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> detallePedido = List.of(10);
        double descuento = Descuento.DescuentoPlatos(detallePedido);
        System.out.println("cantidad de platos es:" + detallePedido + " ,El descuento es de: " + descuento);

        int cantidadPlatos = 16;
        int capacidadMesa = 7;
        double descplame = Descuento.DescuentoPlatosMesas(cantidadPlatos, capacidadMesa);
        System.out.println("El descuento es de: " + descplame);
    }
}
