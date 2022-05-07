package Facade;

public class HardDrive {
    char read(long lba, int size) {
        System.out.println("Reading " + lba + ", size " + size);
        return (char) 2;
    }
}
