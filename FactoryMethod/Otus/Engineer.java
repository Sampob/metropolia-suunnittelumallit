package FactoryMethod.Otus;

import FactoryMethod.Juoma.Jallu;
import FactoryMethod.Juoma.Juoma;

public class Engineer extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Jallu();
    }

}
