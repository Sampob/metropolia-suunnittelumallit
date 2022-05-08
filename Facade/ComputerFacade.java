package Facade;

public class ComputerFacade {
    CPU cpu;
    HardDrive hdd;
    Memory ram;

    private final int bootAddress = 3;
    private final int sectorSize = 4;

    public ComputerFacade(CPU cpu, HardDrive hdd, Memory ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void start() {
        cpu.freeze();
        ram.load(0, hdd.read(bootAddress, sectorSize));
        cpu.jump(0);
        cpu.execute();
    }
}
