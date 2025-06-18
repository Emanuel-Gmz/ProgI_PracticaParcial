import model.Bicicleta;
import model.bicicletas.Montaña;
import model.Bicicleteria;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Montaña("21221","21",12,223);
        Bicicleteria bicicleteria1 = new Bicicleteria(1,bicicleta1,2);


    }
}