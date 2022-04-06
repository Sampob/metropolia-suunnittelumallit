package Memento;

import java.util.Random;

public class Arvuuttaja {

    public static Arvuuttaja INSTANCE = null;

    private Arvuuttaja() {

    }

    public static Arvuuttaja getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Arvuuttaja();
        return INSTANCE;
    }

    public Object liityPeliin(Asiakas a) {
        return new Memento(new Random().nextInt(500));
    }

    public boolean guess(Object m, int i) {
        if (((Memento) m).getData() == i) {
            return true;
        }
        return false;
    }
}
