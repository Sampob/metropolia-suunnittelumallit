package Composite;

import Composite.Laiteosat.Emolevy;
import Composite.Laiteosat.Kotelo;
import Composite.Laiteosat.Muistipiiri;
import Composite.Laiteosat.Naytonohjain;
import Composite.Laiteosat.Prosessori;
import Composite.Laiteosat.Tuuletin;

public class Main {
    public static void main(String[] args) {
        Laiteosa kotelo = new Kotelo();

        Laiteosa emo = new Emolevy();

        kotelo.addOsa(emo);

        kotelo.addOsa(new Tuuletin());
        kotelo.addOsa(new Tuuletin());

        Laiteosa muistipiiri1 = new Muistipiiri();
        Laiteosa muistipiiri2 = new Muistipiiri();

        emo.addOsa(muistipiiri1);
        emo.addOsa(muistipiiri2);

        emo.addOsa(new Naytonohjain());
        emo.addOsa(new Prosessori());

        System.out.println(kotelo.getHinta());
        System.out.println(emo.getHinta());
    }
}
