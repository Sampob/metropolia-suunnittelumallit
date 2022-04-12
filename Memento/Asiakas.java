package Memento;

import java.util.Random;

public class Asiakas extends Thread {

    private Object memento;
    private String name;
    private int g;

    public Asiakas(String s) {
        name = s;
    }

    public void run() {
        memento = Arvuuttaja.getInstance().liityPeliin(this);

        int guess = new Random().nextInt(500);
        while (!Arvuuttaja.getInstance().guess(memento, guess)) {
            if (g % 10 == 0) {
                System.out.println(name + ", guess: " + guess + " was wrong");
            }
            guess = new Random().nextInt(500);
        }
        System.out.println("WINNER WINNER" + ", guess: " + guess + " was right, " + name + " stopping");
    }

}
