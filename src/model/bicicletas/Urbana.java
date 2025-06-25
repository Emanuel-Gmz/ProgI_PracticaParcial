package model.bicicletas;

import model.Vendible;

public class Urbana extends Bicicleta implements Vendible {
    private Bicicleta bicicleta;

    public Urbana() {
    }

    public Urbana(String nroSerie, String modelo, int anio, float precio) {
        super(nroSerie, modelo, anio, precio);
    }

    @Override
    public String getTipo() {
        return "Urbana";
    }

    @Override
    public float calcularPrecioFinal() {
        return precio;
    }
}
