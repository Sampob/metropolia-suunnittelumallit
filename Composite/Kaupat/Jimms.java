package Composite.Kaupat;

import Composite.TietokoneFactory;
import Composite.Laiteosat.Emolevy;
import Composite.Laiteosat.Kotelo;
import Composite.Laiteosat.Muistipiiri;
import Composite.Laiteosat.Naytonohjain;
import Composite.Laiteosat.Prosessori;
import Composite.Laiteosat.Tuuletin;

public class Jimms implements TietokoneFactory {

    @Override
    public Emolevy createEmolevy() {
        Emolevy levy = new Emolevy();
        levy.setHinta(150);
        return levy;
    }

    @Override
    public Kotelo createKotelo() {
        Kotelo kotelo = new Kotelo();
        kotelo.setHinta(65);
        return kotelo;
    }

    @Override
    public Muistipiiri createMuistipiiri() {
        Muistipiiri piiri = new Muistipiiri();
        piiri.setHinta(99);
        return piiri;
    }

    @Override
    public Naytonohjain createNaytonohjain() {
        Naytonohjain gpu = new Naytonohjain();
        gpu.setHinta(600);
        return gpu;
    }

    @Override
    public Prosessori createProsessori() {
        Prosessori cpu = new Prosessori();
        cpu.setHinta(325);
        return cpu;
    }

    @Override
    public Tuuletin createTuuletin() {
        Tuuletin tuuletin = new Tuuletin();
        tuuletin.setHinta(55);
        return tuuletin;
    }

}
