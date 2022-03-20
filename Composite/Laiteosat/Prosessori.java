package Composite.Laiteosat;

import Composite.Laiteosa;

public class Prosessori implements Laiteosa {

    private int hinta = 299;

    @Override
    public int getHinta() {
        return hinta;
    }

    @Override
    public void addOsa(Laiteosa laiteosa) {
        throw new RuntimeException("Can't use function addOsa() on Prosessori");
    }

}
