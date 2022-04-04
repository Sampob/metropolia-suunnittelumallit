package TemplateMethod;

public class Player {

    private String name;
    private int id, score;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
        score = 0;
    }

    public String getName() {
        return name;
    }

    public void setScore(int i) {
        score += i;
        if (score < 0)
            score = 0;
    }

    public int getScore() {
        return score;
    }

    public int getId() {
        return id;
    }
}
