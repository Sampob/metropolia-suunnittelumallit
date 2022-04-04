package State.State;

import State.Pokemon.Pokemon;

public class CharizardState extends PokemonState {
    private static CharizardState instance = null;

    private CharizardState() {
        setDamage(12);
        setHp(50);
    }

    public static CharizardState getInstance() {
        if (instance == null) {
            instance = new CharizardState();
        }
        return instance;
    }

    public void growl() {
        System.out.println("Roar!");
    }

    public void attack(Pokemon p) {
        System.out.println("Charizard used fly");
        p.takeDamage(damage);
    }
}
