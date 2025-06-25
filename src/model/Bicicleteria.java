package model;


import model.bicicletas.Bicicleta;
import model.exception.BicicletaNoDisponible;

import java.util.ArrayList;

public class Bicicleteria{
    private ArrayList<Bicicleta> bicicletas;
    private float ganancias;
    private int cantidadDeVentas;

    public Bicicleteria(){
        bicicletas = new ArrayList<>();
        ganancias = 0;
        cantidadDeVentas = 0;
    }


    public void agregarBicicleta(Bicicleta bici) {
        if (bicicletas.size() < 1000) {
            bicicletas.add(bici);
        } else {
            System.out.println("No se pueden agregar más bicicletas al inventario.");
        }
    }

    public void venderBicicleta(String nroSerie) throws BicicletaNoDisponible {
        Bicicleta biciVender = null;
        for (Bicicleta bici : bicicletas) {
            if (bici.getNroSerie().equalsIgnoreCase(nroSerie)) {
                biciVender = bici;
                float precioFinal = biciVender.calcularPrecioFinal();
                ganancias += precioFinal;
                cantidadDeVentas++;
                bicicletas.remove(bici);
                System.out.println("Bicicleta vendida. Precio: " + precioFinal);
                break;
            }
        }

        if (biciVender == null) {
            throw new BicicletaNoDisponible("La bicicleta con nro de serie " + nroSerie + " no está disponible.");
        }


    }

    public void mostrarBicicletasDisponibles() {
        if (bicicletas.isEmpty()) {
            System.out.println("No hay bicicletas en stock.");
        } else {
            System.out.println("Bicicletas en stock:");
            for (Bicicleta bicicleta : bicicletas) {
                System.out.println("Tipo:" + bicicleta.getTipo() +
                    " Serie:" + bicicleta.getNroSerie() +
                    " Modelo:" + bicicleta.getModelo() +
                    " Año:" + bicicleta.getAnio() +
                    " Precio:" + bicicleta.getPrecio());
            }
        }
    }

    public float getGanancias() {
        return ganancias;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

}
