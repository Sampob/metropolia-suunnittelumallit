package AbstractFactory;

public class Pants implements Clothing {
    private String brand;

    public Pants(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pants by " + brand;
    }
}
