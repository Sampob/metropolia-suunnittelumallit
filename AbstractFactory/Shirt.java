package AbstractFactory;

public class Shirt implements Clothing {

    private String brand;

    public Shirt(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shirt by " + brand;
    }

}
