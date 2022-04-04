package TemplateMethod;

import java.util.ArrayList;

public class SomeGame extends Game {

    ArrayList<Player> players = new ArrayList<Player>();
    Player winner = null;
    int round = 0;

    @Override
    void initializeGame() {
        String name;
        for (int i = 0; i < playersCount; i++) {
            name = "Player " + (i + 1);
            players.add(new Player(name, i));
        }
        for (Player p : players) {
            System.out.println(p.getName() + ", " + p.getId());
        }
    }

    @Override
    void makePlay(int player) {
        Player p = null;
        int rand = (int) (Math.random() * (20 - 1 + 1) + 1);

        for (Player pp : players) {
            if (pp.getId() == player) {
                p = pp;
            } else {
                pp.setScore(-rand);
                System.out.println(pp.getName() + " lost " + rand + " points, " + pp.getScore() + " total.");
            }
        }
        p.setScore(rand);
        System.out.println(p.getName() + " got " + rand + " points, " + p.getScore() + " total.");
        round++;
    }

    @Override
    boolean endOfGame() {
        for (Player p : players) {
            if (p.getScore() >= 25) {
                winner = p;
                return true;
            }
        }

        return false;
    }

    @Override
    void printWinner() {
        System.out.println("Winner is: " + winner.getName() + " with " + winner.getScore() + " points!");
        System.out.println("Took " + round + " rounds");
    }

}
