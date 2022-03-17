package FactoryMethod.Otus;

import FactoryMethod.Juoma.Beer;
import FactoryMethod.Juoma.Juoma;

public class Opiskelija extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Beer();
    }

}
