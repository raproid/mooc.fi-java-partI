
import java.util.Arrays;
import java.util.Random;

public class Dice {

    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

// simple randomizer from 1 up to the user-given number
    public int roll() {
        int randomSide = random.nextInt(numberOfSides) + 1;
        return randomSide;
    }
}
