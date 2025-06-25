import model.bicicletas.Bicicleta;
import model.exception.BicicletaNoDisponible;
import model.bicicletas.Montania;
import model.Bicicleteria;
import model.bicicletas.Urbana;

public class Main {
    public static void main(String[] args) {
        Bicicleteria bicicleteriaCarlos = new Bicicleteria();

        Bicicleta bici1 = new Urbana("AA00258741", "Belmondo Urban Rodado 700c", 2025, 661800);
        Bicicleta bici2 = new Montania("AB00285242", "Mountain bike Olmo Wish 290 Tourney TZ31", 2024, 810877);
        Bicicleta bici3 = new Montania("AC00774422", "Mtb Overtech Q6 R29 Aluminio", 2025, 788999);


        bicicleteriaCarlos.agregarBicicleta(bici1);
        bicicleteriaCarlos.agregarBicicleta(bici2);
        bicicleteriaCarlos.agregarBicicleta(bici3);

        bicicleteriaCarlos.mostrarBicicletasDisponibles();


        try {
            bicicleteriaCarlos.venderBicicleta("AB00285242");
        } catch (BicicletaNoDisponible e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            bicicleteriaCarlos.venderBicicleta("AA00258741");
        } catch (BicicletaNoDisponible e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            bicicleteriaCarlos.venderBicicleta("gz12345678");
        } catch (BicicletaNoDisponible e) {
            System.out.println("Error: " + e.getMessage());
        }


        System.out.println("Total ventas: " + bicicleteriaCarlos.getCantidadDeVentas());
        System.out.println("Ganancias: $" + bicicleteriaCarlos.getGanancias());
    }
}