package AbstractFactory;

public class Shoes implements Clothing {
    private String brand;

    public Shoes(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shoes by " + brand;
    }
}
