package Memento;

public class Main {
    public static void main(String[] args) {
        Asiakas asiakas1 = new Asiakas("Eka");
        Asiakas asiakas2 = new Asiakas("Toka");
        Asiakas asiakas3 = new Asiakas("Kolmas");
        Asiakas asiakas4 = new Asiakas("Neljäs");
        Asiakas asiakas5 = new Asiakas("Viides");

        asiakas1.start();
        asiakas2.start();
        asiakas3.start();
        asiakas4.start();
        asiakas5.start();
    }
}
