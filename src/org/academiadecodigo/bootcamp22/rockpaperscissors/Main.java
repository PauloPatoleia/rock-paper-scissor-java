package org.academiadecodigo.bootcamp22.rockpaperscissors;

public class Main {

    public static void main(String[] args) {

        Utils.setDebuggingMode(true);

        Players[] PlayersList = {new Players("Carl"), new Players("Jim")};
        Game BestOfThree = new Game(PlayersList, 3);
        BestOfThree.start();

    }
}
