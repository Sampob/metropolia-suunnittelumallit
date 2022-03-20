package AbstractFactory;

import AbstractFactory.Clothes.Hat;
import AbstractFactory.Clothes.Pants;
import AbstractFactory.Clothes.Shirt;
import AbstractFactory.Clothes.Shoes;

public abstract interface ClothesFactory {
    abstract Shoes createShoes();

    abstract Hat createHat();

    abstract Pants createPants();

    abstract Shirt createShirt();
}
