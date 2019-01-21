package org.academiadecodigo.bootcamp22.rockpaperscissors;

public enum Hands {

    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    private String dontknowdontcare;

    Hands(String dontknowdontcare) {
        this.dontknowdontcare = dontknowdontcare;
    }

    public String getDontknowdontcare() {
        return this.dontknowdontcare;
    }
}
