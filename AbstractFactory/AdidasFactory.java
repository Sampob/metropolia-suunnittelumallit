package AbstractFactory;

import AbstractFactory.Clothes.Hat;
import AbstractFactory.Clothes.Pants;
import AbstractFactory.Clothes.Shirt;
import AbstractFactory.Clothes.Shoes;

public class AdidasFactory implements ClothesFactory {

    private final String brand = "Adidas";

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
