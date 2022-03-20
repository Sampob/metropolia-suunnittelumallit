package Composite;

import Composite.Laiteosat.Emolevy;
import Composite.Laiteosat.Kotelo;
import Composite.Laiteosat.Muistipiiri;
import Composite.Laiteosat.Naytonohjain;
import Composite.Laiteosat.Prosessori;
import Composite.Laiteosat.Tuuletin;

public abstract interface TietokoneFactory {
    abstract Emolevy createEmolevy();

    abstract Kotelo createKotelo();

    abstract Muistipiiri createMuistipiiri();

    abstract Naytonohjain createNaytonohjain();

    abstract Prosessori createProsessori();

    abstract Tuuletin createTuuletin();
}
