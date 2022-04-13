package Visitor;

import Visitor.Pokemon.FirePokemon;
import Visitor.Pokemon.Pokemon;
import Visitor.Visit.PokemonVisitor;

public class Main {
    public static void main(String[] args) {
        Pokemon fire = new FirePokemon();

        fire.growl();
        fire.getXP(110);
        fire.growl();
        fire.accept(new PokemonVisitor());

        System.out.println(fire.getPoints());

        fire.getXP(1000);
        fire.addPoints(-20);
        fire.growl();
        fire.accept(new PokemonVisitor());

        System.out.println(fire.getPoints());

    }

}
