package Facade;

public class CPU {
    void freeze() {
        System.out.println("Freezing");
    }

    void jump(long pos) {
        System.out.println("Jumping to " + pos);

    }

    void execute() {
        System.out.println("Executing");
    }
}
