package FactoryMethod.Juoma;

public class Jallu implements Juoma {
    public String toString() {
        return "jallu";
    }

    @Override
    public String ryys() {
        return "Ryyps";
    }
}
