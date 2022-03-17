package FactoryMethod;

import FactoryMethod.Otus.AterioivaOtus;
import FactoryMethod.Otus.Engineer;
import FactoryMethod.Otus.Opettaja;
import FactoryMethod.Otus.Opiskelija;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus insinoori = new Engineer();

        opettaja.aterioi();
        System.out.println("\n###\n");

        opiskelija.aterioi();
        System.out.println("\n###\n");

        insinoori.aterioi();
        System.out.println("\n###\n");
    }
}
