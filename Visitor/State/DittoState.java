package Visitor.State;

import State.Pokemon.Pokemon;
import Visitor.Visit.StateVisitor;

public class DittoState extends PokemonState {
    private static DittoState instance = null;

    private DittoState() {
        setDamage(5);
        setHp(15);
    }

    public static DittoState getInstance() {
        if (instance == null) {
            instance = new DittoState();
        }
        return instance;
    }

    public void growl() {
        System.out.println("Ditto!");
    }

    public void attack(Pokemon p) {
        System.out.println("Ditto used quick attack");
        p.takeDamage(damage);
    }

    @Override
    public int accept(StateVisitor v) {
        return v.visitState(this);
    }

}
