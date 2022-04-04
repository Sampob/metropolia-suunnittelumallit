package State;

import State.Pokemon.FirePokemon;
import State.Pokemon.NormalPokemon;
import State.Pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon fire = new FirePokemon();
        Pokemon ditto = new NormalPokemon();

        fire.growl();

        fire.attack(ditto);
        fire.getXP(110);

        fire.growl();

        ditto.growl();
        ditto.attack(fire);

        fire.getXP(1000);
        fire.attack(ditto);
        fire.growl();
        fire.attack(ditto);
    }

}
