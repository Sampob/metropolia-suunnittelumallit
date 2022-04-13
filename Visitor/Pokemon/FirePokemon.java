package Visitor.Pokemon;

import Visitor.State.CharmanderState;
import Visitor.Visit.StateVisitor;

public class FirePokemon extends Pokemon {

    public FirePokemon() {
        state = CharmanderState.getInstance();
        hp = state.getHp();
    }

    @Override
    public void accept(StateVisitor v) {
        addPoints(this.state.accept(v));
    }

}
