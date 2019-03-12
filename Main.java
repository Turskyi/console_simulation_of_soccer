package penalty;

// Simulator of Soccer Game. In the role of the commentator is the console. Use aggregation.
//  Classes: football player (name, skills), a team (array of players, name, score), game (two teams),
//  main class (starts the game).
public class Main {
    public static void main(String[] args) {
        Game game = new Game ( );
        game.start ( );
    }
}
