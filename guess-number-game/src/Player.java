import java.util.Random;

public class Player {

    private String name;

    public Player(String name) {

        this.name = name;
    }

    public int generateGuess() {

        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getName() {

        return name;
    }
}
