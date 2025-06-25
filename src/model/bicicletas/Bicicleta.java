package model.bicicletas;

import model.Vendible;

public abstract class Bicicleta implements Vendible {
    public String nroSerie;
    public String modelo;
    public int anio;
    public float precio;

    public Bicicleta() {}

    public Bicicleta(String nroSerie, String modelo, int anio, float precio) {
        this.nroSerie = nroSerie;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }



    //GETT
    public String getNroSerie() {return nroSerie;}
    public String getModelo() {return modelo;}
    public float getPrecio() {return precio;}
    public int getAnio() {return anio;}

    //SETT
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setAnio(int anio) {this.anio = anio;}
    public void setNroSerie(String nroSerie) {this.nroSerie = nroSerie;}
    public void setPrecio(float precio) {this.precio = precio;}

    public abstract String getTipo();

    public abstract float calcularPrecioFinal();
}
