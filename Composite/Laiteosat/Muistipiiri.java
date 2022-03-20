package Composite.Laiteosat;

import Composite.Laiteosa;

public class Muistipiiri implements Laiteosa {

    private int hinta = 49;

    @Override
    public int getHinta() {
        return hinta;
    }

    @Override
    public void addOsa(Laiteosa laiteosa) {
        throw new RuntimeException("Can't use function addOsa() on Muistipiiri");
    }

}
