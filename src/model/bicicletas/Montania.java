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
    public float getPrecio() {
        return super.getPrecio();
    }

    @Override
    public void setPrecio(float precio) {
        super.setPrecio(precio);
    }

    @Override
    public String getTipo() {
        return "Montaña";
    }

    @Override
    public float calcularPrecioFinal() {
        if (anio < 2025){
            return (float) (precio*0.90);
        }else return (float) (precio*1.21);
    }
}
