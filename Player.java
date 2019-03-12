package penalty;

class Player {

    private String name;
    private int skills;

    Player(String name, int skills) {

        this.name = name;
        this.skills = skills;
    }

    int getSkills() {
        return skills;
    }

    String getName() {
        return name;
    }
}
