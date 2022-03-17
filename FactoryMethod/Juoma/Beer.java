package FactoryMethod.Juoma;

public class Beer implements Juoma {

    public String toString() {
        return "olut";
    }

    @Override
    public String ryys() {
        return "Hörps";
    }

}
