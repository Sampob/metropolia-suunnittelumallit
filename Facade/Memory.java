package Facade;

public class Memory {
    char[] inMemory = new char[10];

    void load(long position, char[] data) {
        System.out.println("Loading data to memory");
        for (int i = 0; i < data.length; i++) {
            inMemory[(int) (position + i)] = data[i];
        }
        System.out.println("Loaded");
    }

    char[] getMem() {
        return inMemory;
    }
}
