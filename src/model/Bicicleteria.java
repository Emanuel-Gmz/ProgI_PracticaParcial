package model;



public class Bicicleteria{
    private String[] inventario = new String[1000];
    private float ganancias;
    private int cantidadDeVentas;
    private Bicicleta bicicleta;

    public Bicicleteria() {
    }

    public Bicicleteria(float ganancias, Bicicleta bicicleta, int cantidadDeVentas) {
        this.ganancias = ganancias;
        agregarBicicleta();
        this.cantidadDeVentas = cantidadDeVentas;
        this.bicicleta = bicicleta;
    }



    private void agregarBicicleta(){
        for (int i=0; i< inventario.length;i++){
            inventario[i] = String.valueOf(bicicleta);
        }
    }
    private void venderBicicleta() {}
    private void mostrarBicicletasDisponibles(){
        System.out.println("Bicicleta" + "\n Numero serie " + bicicleta.getNroSerie()
        + "\n Modelo: " + bicicleta.getModelo() + "\n Año: " + bicicleta.getAnio() + "\n Precio:" + bicicleta.getPrecio());
    }
}
