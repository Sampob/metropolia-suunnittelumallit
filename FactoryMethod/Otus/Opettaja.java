package FactoryMethod.Otus;

import FactoryMethod.Juoma.Juoma;
import FactoryMethod.Juoma.Vesi;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Vesi();
    };

}
