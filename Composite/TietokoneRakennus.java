package Composite;

import Composite.Kaupat.Jimms;
import Composite.Kaupat.Newegg;
import Composite.Laiteosat.Emolevy;
import Composite.Laiteosat.Kotelo;

public class TietokoneRakennus {
    private Emolevy emo = null;
    private Kotelo kotelo = null;

    public void rakennaTietokone(TietokoneFactory factory) {
        kotelo = factory.createKotelo();
        emo = factory.createEmolevy();
        kotelo.addOsa(emo);
        emo.addOsa(factory.createMuistipiiri());
        emo.addOsa(factory.createNaytonohjain());
        emo.addOsa(factory.createProsessori());
        kotelo.addOsa(factory.createTuuletin());
    }

    public void showParts() {
        System.out.println(emo.getHinta());
        System.out.println(kotelo.getHinta());
    }

    public static void main(String[] args) {
        TietokoneRakennus rakenna = new TietokoneRakennus();
        rakenna.rakennaTietokone(new Jimms());
        rakenna.showParts();

        rakenna.rakennaTietokone(new Newegg());
        rakenna.showParts();
    }
}
