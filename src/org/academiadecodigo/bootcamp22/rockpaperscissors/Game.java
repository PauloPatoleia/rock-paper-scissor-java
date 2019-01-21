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

        if(ReadyToPlay) {

            Utils.log("Game started");

            int PlayerOne = 0;
            int PlayerTwo = 0;

            while(PlayerOne < rounds && PlayerTwo < rounds) {

                // players[0].choseHand().getDontknowdontcare(), players[1].choseHand().getDontknowdontcare())

                String PlayerOnePick = players[0].choseHand().getDontknowdontcare();
                String PlayerTwoPick = players[1].choseHand().getDontknowdontcare();

                Utils.log("1 " + PlayerOnePick);
                Utils.log("2 " + PlayerTwoPick);

                switch (checkWinner(PlayerOnePick, PlayerTwoPick)) {

                    case 0:
                        break;
                    case 1:
                        PlayerOne++;
                        break;
                    case 2:
                        PlayerTwo++;
                        break;
                    default:

                }

                Utils.log("Player 1: " + PlayerOne + "  ||   Player 2: " + PlayerTwo);
            }

            if(PlayerOne == 3) {
                System.out.println(players[0].getName() + " won!");
            }

            if(PlayerTwo == 3) {
                System.out.println(players[1].getName() + " won!");
            }

        }

    }

    public int checkWinner(String PlayerOneChoice, String PlayerTwoChoice) {

        if ( PlayerOneChoice.equals("rock") && PlayerTwoChoice.equals("rock")) {
            return 0;
        }

        if ( PlayerOneChoice.equals("rock") && PlayerTwoChoice.equals("scissors")) {
            return 1;
        }

        if ( PlayerOneChoice.equals("rock") && PlayerTwoChoice.equals("paper")) {
            return 2;
        }

        if ( PlayerOneChoice.equals("paper" ) && PlayerTwoChoice.equals("paper")) {
            return 0;
        }

        if ( PlayerOneChoice.equals("paper") && PlayerTwoChoice.equals("scissors")) {
            return 2;
        }

        if ( PlayerOneChoice.equals("paper") && PlayerTwoChoice.equals("rock")) {
            return 1;
        }
        if ( PlayerOneChoice.equals("scissors") && PlayerTwoChoice.equals("scissors")) {
            return 0;
        }

        if ( PlayerOneChoice.equals("scissors") && PlayerTwoChoice.equals("rock")) {
            return 2;
        }

        if ( PlayerOneChoice.equals("scissors") && PlayerTwoChoice.equals("paper")) {
            return 1;
        }

        return 0;
    }
}
