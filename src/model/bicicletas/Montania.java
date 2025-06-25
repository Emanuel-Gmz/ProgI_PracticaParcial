package model.bicicletas;

import model.Vendible;

public class Montania extends Bicicleta implements Vendible {
    private Bicicleta bicicleta;

    public Montania() {
    }

    public Montania(String nroSerie, String modelo, int anio, float precio) {
        super(nroSerie, modelo, anio, precio);
    }

    @Override
    public String getTipo() {
        return "Montaña";
    }

    @Override
    public float calcularPrecioFinal() {
        return precio;
    }
}
