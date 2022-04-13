package Visitor.State;

import Visitor.Pokemon.*;
import Visitor.Visit.StateVisitor;

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

    public abstract int accept(StateVisitor v);

}
