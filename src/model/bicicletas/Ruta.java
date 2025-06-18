package model.bicicletas;

import model.Bicicleta;
import model.Vendible;

public class Ruta extends Bicicleta implements Vendible {
    private Bicicleta bicicleta;

    public Ruta() {
    }

    public Ruta(String nroSerie, String modelo, int anio, float precio) {
        super(nroSerie, modelo, anio, precio);
    }

    @Override
    public void tipoBicicleta(){
        this.getModelo();
    }

    @Override
    public float calcularPrecioFinal() {
        switch (bicicleta.getAnio()){
            case 1:
                return 80000;
            case 2:
                return 16000;
            case 3:
                return 25000;
        }
        return 0;
    }
}
