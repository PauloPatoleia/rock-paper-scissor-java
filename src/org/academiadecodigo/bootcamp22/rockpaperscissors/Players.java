package org.academiadecodigo.bootcamp22.rockpaperscissors;

public class Players {

    private String name;

    public Players(String name) {
        this.name = name;
    }

    public Hands choseHand() {

        int pick = Random.Generate(3);

        if(pick == 1) {
            return Hands.ROCK;
        }

        if(pick == 2) {
            return Hands.PAPER;
        }

        return Hands.SCISSORS;

    }

    public String getName() {
        return name;
    }
}
