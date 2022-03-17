package FactoryMethod.Juoma;

public class Vesi implements Juoma {

    public String toString() {
        return "vesi";
    }

    @Override
    public String ryys() {
        return "Glug glug";
    }

}
