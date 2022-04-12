package Memento;

public class Main {
    public static void main(String[] args) {
        Asiakas asiakas1 = new Asiakas("Eka");
        Asiakas asiakas2 = new Asiakas("Toka");
        Asiakas asiakas3 = new Asiakas("Kolmas");

        asiakas1.start();
        asiakas2.start();
        asiakas3.start();

        try {
            asiakas1.join();
            asiakas2.join();
            asiakas3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("ALL DONE");

    }
}
