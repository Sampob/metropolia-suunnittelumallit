package Facade;

public class HardDrive {
    private char[] data = { 'C', 'A', 'T', 'B', 'O', 'O', 'T', 'W', 'H', 'L', 'M', 'Q', 'Y', 'P' };

    char[] read(long lba, int size) {
        System.out.println("Reading " + lba + ", size " + size);
        char[] r = new char[size];
        for (int i = 0; i < size; i++) {
            r[i] = data[(int) lba + i];
        }
        return r;
    }
}
