package model.bicicletas;

import model.Bicicleta;
import model.Vendible;

public class Montaña extends Bicicleta implements Vendible {
    private Bicicleta bicicleta;

    public Montaña() {
    }

    public Montaña(String nroSerie, String modelo, int anio, float precio) {
        super(nroSerie, modelo, anio, precio);
    }

    @Override
    public void tipoBicicleta(){
        this.getModelo();
    }

    @Override
    public float calcularPrecioFinal() {
        switch (bicicleta.getAnio()){
            case 2:
                return 80000;
            case 1:
                return 16000;
            case 23:
                return 25000;
        }
        return 0;

    }
}
