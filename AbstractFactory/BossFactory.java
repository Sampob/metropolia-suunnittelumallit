package AbstractFactory;

public class BossFactory implements ClothesFactory {

    private final String brand = "Boss";

    @Override
    public Shoes createShoes() {
        return new Shoes(brand);
    }

    @Override
    public Hat createHat() {
        return new Hat(brand);
    }

    @Override
    public Pants createPants() {
        return new Pants(brand);
    }

    @Override
    public Shirt createShirt() {
        return new Shirt(brand);
    }

}
