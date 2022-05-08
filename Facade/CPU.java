package Facade;

public class CPU {

    Memory memory;
    int pos;

    void setCPU(Memory m) {
        memory = m;
    }

    void freeze() {
        System.out.println("Freezing");
        this.pos = 0;
    }

    void jump(int pos) {
        System.out.println("Jumping to " + pos);
        this.pos = pos;
    }

    void execute() {
        System.out.println("Executing\n---");
        for (int i = pos; i < memory.inMemory.length; i++) {
            System.out.println(memory.inMemory[i]);
        }
        System.out.println("---\nExecuted");
    }
}
