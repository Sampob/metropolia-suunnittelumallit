package AbstractFactory;

import AbstractFactory.Clothes.Hat;
import AbstractFactory.Clothes.Pants;
import AbstractFactory.Clothes.Shirt;
import AbstractFactory.Clothes.Shoes;

public class Jasper {
    private Pants pants = null;
    private Hat hat = null;
    private Shirt shirt = null;
    private Shoes shoes = null;

    public void wearOutfit(ClothesFactory factory) {
        pants = factory.createPants();
        hat = factory.createHat();
        shirt = factory.createShirt();
        shoes = factory.createShoes();
    }

    public void showYourOutfit() {
        System.out.println("I'm wearing: ");
        System.out.println(hat);
        System.out.println(shirt);
        System.out.println(pants);
        System.out.println(shoes);
    }

    public static void main(String[] args) {

        Jasper jasper = new Jasper();
        jasper.wearOutfit(new AdidasFactory());
        jasper.showYourOutfit();

        jasper.wearOutfit(new BossFactory());
        jasper.showYourOutfit();
    }
}
