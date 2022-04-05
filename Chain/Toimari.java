package Chain;

import java.util.Random;

public class Toimari extends Korotus {
    public void processRequest(KorotusPyynto p) {
        if (new Random().nextInt(2) == 0) {
            System.out.println("Toimitusjohtaja antaa korotuksen");
        } else {
            System.out.println("Toimitusjohtaja ei anna korotusta");
        }
    }

}
