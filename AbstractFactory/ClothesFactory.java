package AbstractFactory;

public abstract interface ClothesFactory {
    abstract Shoes createShoes();

    abstract Hat createHat();

    abstract Pants createPants();

    abstract Shirt createShirt();
}
