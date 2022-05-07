package Prototype;

public class Main {
    public static void main(String[] args) {
        MinuuttiViisari min = new MinuuttiViisari(0);
        TuntiViisari hour = new TuntiViisari(0);
        Kello kello = new Kello(min, hour);

        kello.advanceTime();
        System.out.println(kello);

        Kello kello2 = (Kello) kello.clone();

        System.out.println(kello2);

        kello2.advanceTime();

        System.out.println(kello);
        System.out.println(kello2);
    }
}
