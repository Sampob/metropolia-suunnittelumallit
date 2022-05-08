package Facade;

public class Main {
    public static void main(String[] args) {
        ComputerFacade cf = new ComputerFacade(new CPU(), new HardDrive(), new Memory());
        cf.start();
    }
}
