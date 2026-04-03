package WWE;

import java.util.Random;

public class Elenco {

    public static void main(String[] args) {
        Random random = new Random();

        Lutador lutador1 = new Lutador("Planta", "Jardim", random.nextInt(25, 50), random.nextDouble(150, 210), random.nextDouble(52, 110), 0, 0, 0);

        lutador1.apresentar();
        lutador1.status();

        System.out.println("");

        Lutador lutador2 = new Lutador("Zombie", "Cemitério", random.nextInt(25, 50), random.nextDouble(150, 210), random.nextDouble(52, 110), 0, 0, 0);

        lutador2.apresentar();
        lutador2.status();
        
        //Objeto Luta

        Luta luta1 = new Luta();

        luta1.marcarLuta(lutador1, lutador2);
        System.out.println("");
        luta1.lutar(lutador1, lutador2);
        System.out.println("");
        lutador1.status();
        System.out.println("");
        lutador2.status();

    }
}
