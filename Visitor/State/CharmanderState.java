package Visitor.State;

import Visitor.Pokemon.*;
import Visitor.Visit.StateVisitor;

public class CharmanderState extends PokemonState {
    private static CharmanderState instance = null;

    private CharmanderState() {
        setDamage(3);
        setHp(10);
    }

    public static CharmanderState getInstance() {
        if (instance == null) {
            instance = new CharmanderState();
        }
        return instance;
    }

    public void growl() {
        System.out.println("Charmander!");
    }

    public void attack(Pokemon p) {
        System.out.println("Charmander used tackle");
        p.takeDamage(damage);
    }

    public void evolve(Pokemon p) {
        changeState(p, CharmeleonState.getInstance());
    }

    @Override
    public int accept(StateVisitor v) {
        return v.visitState(this);
    }

}
