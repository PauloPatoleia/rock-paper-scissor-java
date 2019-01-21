package org.academiadecodigo.bootcamp22.rockpaperscissors;

public class Game {

    Players[] players;
    int rounds;
    boolean ReadyToPlay = true;

    public Game(Players[] players, int rounds) {

        if (players.length != 2) {

            ReadyToPlay = false;
            System.out.println("Game requires 2 players, no more, no less.");

        }

        this.players = players;
        this.rounds = rounds;

    }

    public void start() {

        if (!ReadyToPlay) {
            return;
        }

        Utils.log("Game started");

        // TODO: 21/01/2019 player.reset()  -> DONE
        players[0].resetScore();
        players[1].resetScore();

        while (players[0].getScore() < rounds && players[0].getScore() < rounds) { // TODO: 21/01/2019 player.getScore() -> DONE

            // players[0].choseHand().getDontknowdontcare(), players[1].choseHand().getDontknowdontcare())

            String PlayerOnePick = players[0].choseHand().name().toLowerCase(); // TODO: 21/01/2019 hand
            String PlayerTwoPick = players[1].choseHand().name().toLowerCase();

            Utils.log("1 " + PlayerOnePick);
            Utils.log("2 " + PlayerTwoPick);

            switch (checkWinner(PlayerOnePick, PlayerTwoPick)) {

                case 1:
                    players[0].roundWon(); // TODO: 21/01/2019 play.winRound() - DONE
                    break;
                case 2:
                    players[1].roundWon();

            }

            Utils.log("Player 1: " + players[0].getScore() + "  ||   Player 2: " + players[0].getScore());
        }


        System.out.println(players[0].getScore() == rounds ? players[0].getName() + " won!" : players[1].getName() + " won!");

    }


    public int checkWinner(String PlayerOneChoice, String PlayerTwoChoice) {

        if (PlayerOneChoice.equals(PlayerTwoChoice)) {

            return 0;
        }

        if (PlayerOneChoice.equals("rock") && PlayerTwoChoice.equals("scissors")) {
            return 1;
        }

        if (PlayerOneChoice.equals("rock") && PlayerTwoChoice.equals("paper")) {
            return 2;
        }

        if (PlayerOneChoice.equals("paper") && PlayerTwoChoice.equals("paper")) {
            return 0;
        }

        if (PlayerOneChoice.equals("paper") && PlayerTwoChoice.equals("scissors")) {
            return 2;
        }

        if (PlayerOneChoice.equals("paper") && PlayerTwoChoice.equals("rock")) {
            return 1;
        }
        if (PlayerOneChoice.equals("scissors") && PlayerTwoChoice.equals("scissors")) {
            return 0;
        }

        if (PlayerOneChoice.equals("scissors") && PlayerTwoChoice.equals("rock")) {
            return 2;
        }

        if (PlayerOneChoice.equals("scissors") && PlayerTwoChoice.equals("paper")) {
            return 1;
        }

        return 0;
    }
}
