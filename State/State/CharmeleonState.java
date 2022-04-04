package State.State;

import State.Pokemon.Pokemon;

public class CharmeleonState extends PokemonState {
    private static CharmeleonState instance = null;

    private CharmeleonState() {
        setDamage(5);
        setHp(20);
    }

    public static CharmeleonState getInstance() {
        if (instance == null) {
            instance = new CharmeleonState();
        }
        return instance;
    }

    public void growl() {
        System.out.println("Charmeleon!");
    }

    public void attack(Pokemon p) {
        System.out.println("Charmeleon used ember");
        p.takeDamage(damage);
    }

    public void evolve(Pokemon p) {
        changeState(p, CharizardState.getInstance());
    }
}
