package State.Pokemon;

import State.State.CharmanderState;

public class FirePokemon extends Pokemon {

    public FirePokemon() {
        state = CharmanderState.getInstance();
        hp = state.getHp();
    }

}
