package State.Pokemon;

import State.State.DittoState;

public class NormalPokemon extends Pokemon {

    public NormalPokemon() {
        state = DittoState.getInstance();
        hp = state.getHp();
    }
}
