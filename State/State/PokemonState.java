package State.State;

import State.Pokemon.Pokemon;

public abstract class PokemonState {
    protected int hp, damage;

    protected void setHp(int i) {
        this.hp = i;
    }

    protected void setDamage(int i) {
        this.damage = i;
    }

    public int getHp() {
        return this.hp;
    }

    public void evolve(Pokemon p) {
    }

    public void growl() {

    }

    public void attack(Pokemon p) {
        p.takeDamage(damage);
    }

    void changeState(Pokemon p, PokemonState s) {
        p.changeState(s);
    }
}
