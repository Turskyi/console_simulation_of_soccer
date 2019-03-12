package penalty;

import java.util.Random;

class Game {
    private Random ran = new Random ( );
    private Team teamA;
    private Team teamB;


    Game() {

        Player[] arrPlayersA = new Player[11];
        Player[] arrPlayersB = new Player[11];

        for (int i = 0; i < arrPlayersA.length; i++) {
            String[] namesA = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};

            Player playerA = new Player (namesA[ran.nextInt (11)], ran.nextInt (100) + 1);

            arrPlayersA[i] = playerA;
        }

        for (int i = 0; i < arrPlayersB.length; i++) {

            String[] namesB = {"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V"};

            Player playerB = new Player (namesB[ran.nextInt (11)], ran.nextInt (100) + 1);
            arrPlayersB[i] = playerB;
        }

        teamA = new Team (arrPlayersA, "Alfa", 0);
        teamB = new Team (arrPlayersB, "Beta", 0);

    }


    void start() {


        while ((teamA.getPoints ( ) < 3) && (teamB.getPoints ( ) < 3)) {

//       or in order one by one with:
//       for ( int i = 0 ; (teamA.getPoints ( ) < 3) && (teamB.getPoints ( ) < 3) ; i++){
//                 where teamA.getPlayers ()[ran.nextInt(10)].getName ( ) = teamA.getPlayers ()[i].getName ( )

            System.out.println ("Player " + teamA.getPlayers ( )[ran.nextInt (10)].getName ( ) + " from Team "
                    + teamA.getName ( ) + " hitting the ball against Team " + teamB.getName ( ));

            if (teamA.getPlayers ( )[ran.nextInt (10)].getSkills ( ) > teamB.getPlayers ( )
                    [ran.nextInt (10)].getSkills ( )) {
                teamA.setPoints (teamA.getPoints ( ) + 1);

                System.out.println ("Goalkeeper of Team " + teamB.getName ( ) + "missed the ball \n Team "
                        + teamA.getName ( ) + " got the point");
                System.out.println (" " + teamA.getName ( ) + " " + teamA.getPoints ( ) + " : " + teamB.getName ( )
                        + " " + teamB.getPoints ( ));

                if (teamA.getPoints ( ) == 3) {
                    System.out.println ("Game Over \n Team " + teamA.getName ( ) + " won");
                    return;
                }
            } else {

                System.out.println
                        ("Goalkeeper of Team " + teamB.getName ( ) + " got the ball. The game keeps going...");
            }

            System.out.println ("Player " + teamB.getPlayers ( )[ran.nextInt (10)].getName ( )
                    + " from Team " + teamB.getName ( ) + " hitting the ball against Team " + teamA.getName ( ));

            if (teamB.getPlayers ( )[ran.nextInt (10)].getSkills ( ) > teamA.getPlayers ( )
                    [ran.nextInt (10)].getSkills ( )) {
                teamB.setPoints (teamB.getPoints ( ) + 1);
                System.out.println ("Goalkeeper of Team " + teamA.getName ( )
                        + " missed the ball \n Team " + teamB.getName ( ) + " got the point");
                System.out.println (" " + teamA.getName ( ) + " " + teamA.getPoints ( )
                        + ": " + teamB.getName ( ) + " " + teamB.getPoints ( ));
                if (teamB.getPoints ( ) == 3) {
                    System.out.println ("Game Over \n Team " + teamB.getName ( ) + " won");
                    return;
                }

            } else
                System.out.println
                        ("Goalkeeper of Team " + teamA.getName ( ) + " got the ball. The game keeps going...");
        }
    }
}