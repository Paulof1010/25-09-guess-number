import java.util.Random;

public class Boss {

    private String name;

    public Boss(String name) {

        this.name = name;

    }

    public int generateTarget() {

        Random target = new Random();
        return target.nextInt(10) + 1;
    }

    

    public String getName() {
        return name;
    }



}
