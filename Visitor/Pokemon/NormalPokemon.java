package Visitor.Pokemon;

import Visitor.State.*;
import Visitor.Visit.StateVisitor;

public class NormalPokemon extends Pokemon {

    public NormalPokemon() {
        state = DittoState.getInstance();
        hp = state.getHp();
    }

    @Override
    public void accept(StateVisitor v) {
        addPoints(state.accept(v));
    }
}
