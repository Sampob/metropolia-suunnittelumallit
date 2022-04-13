package Visitor.Pokemon;

import Visitor.State.*;
import Visitor.Visit.StateVisitor;

public abstract class Pokemon {

    protected int xp = 0;
    protected PokemonState state;
    protected int hp;
    protected int points;

    public Pokemon() {
    }

    public void getXP(int i) {
        xp += i;
        if (xp > 100) {
            state.evolve(this);
        } else if (xp > 250) {
            state.evolve(this);
        }
    }

    public void takeDamage(int i) {
        hp -= i;
        if (hp < 0) {
            System.out.println("Pokemon fainted");
        }
    }

    public void changeState(PokemonState s) {
        state = s;
        hp = state.getHp();
    }

    public void attack(Pokemon p) {
        state.attack(p);
    }

    public void attack() {
        System.out.println("Miss");
    }

    public void growl() {
        state.growl();
    }

    public void addPoints(int i) {
        points += i;
    }

    public int getPoints() {
        return points;
    }

    public abstract void accept(StateVisitor v);

}
