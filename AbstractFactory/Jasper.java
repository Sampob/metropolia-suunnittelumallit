package AbstractFactory;

public class Jasper {
    private Pants pants = null;
    private Hat hat = null;
    private Shirt shirt = null;
    private Shoes shoes = null;
    private ClothesFactory factory = null;

    public void wearAdidas() {
        factory = new AdidasFactory();
    }

    public void wearBoss() {
        factory = new BossFactory();
    }

    public void showYourOutfit() {
        pants = factory.createPants();
        hat = factory.createHat();
        shirt = factory.createShirt();
        shoes = factory.createShoes();

        System.out.println("I'm wearing: ");
        System.out.println(hat);
        System.out.println(shirt);
        System.out.println(pants);
        System.out.println(shoes);
    }

    public static void main(String[] args) {

        Jasper jasper = new Jasper();
        jasper.wearBoss();
        jasper.showYourOutfit();
    }
}
