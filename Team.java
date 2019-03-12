package penalty;

class Team {

    private Player[] players;
    private String name;
    private int points;

    Team(Player[] players, String name, int points) {
        this.players = players;
        this.name = name;
        this.points = points;
    }

    Player[] getPlayers() {
        return players;
    }


    String getName() {
        return name;
    }
    

    int getPoints() {
        return points;
    }

    void setPoints(int points) {
        this.points = points;
    }
}
