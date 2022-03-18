package AbstractFactory;

public class Hat implements Clothing {
    private String brand;

    public Hat(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Hat by " + brand;
    }
}
