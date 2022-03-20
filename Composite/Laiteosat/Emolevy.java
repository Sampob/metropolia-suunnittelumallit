package Composite.Laiteosat;

import java.util.ArrayList;
import java.util.List;

import Composite.Laiteosa;

public class Emolevy implements Laiteosa {

    private int hinta = 200;
    private List<Laiteosa> osat = new ArrayList<Laiteosa>();

    @Override
    public int getHinta() {
        int total = 0;
        for (Laiteosa osa : osat) {
            total += osa.getHinta();
        }
        return total + hinta;
    }

    @Override
    public void addOsa(Laiteosa laiteosa) {
        osat.add(laiteosa);
    }

}
