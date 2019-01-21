package org.academiadecodigo.bootcamp22.rockpaperscissors;

public class Players {

    private String name;
    private int Score;

    public Players(String name) {
        this.name = name;
    }

    public Hands choseHand() {

        return  Hands.values()[Random.Generate(Hands.values().length)];

    }

    public String getName() {
        return name;
    }

    public void roundWon() {
        Score++;
    }

    public int getScore() {
        return this.Score;
    }

    public void resetScore() {
        this.Score = 0;
    }
}
