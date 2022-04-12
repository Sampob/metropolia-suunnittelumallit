package Builder;

public class Customer {

    public static void main(String[] args) {
        Waiter w = new Waiter();

        IBurgerBuilder bb = new BigMacBuilder();

        w.setBuilder(bb);
        w.createBurger();

        System.out.println((BigMac) bb.getBurger());

        bb = new KerrosHampurilainenBuilder();
        w.setBuilder(bb);
        w.createBurger();

        System.out.println((KerrosHampurilainen) bb.getBurger());

    }
}
