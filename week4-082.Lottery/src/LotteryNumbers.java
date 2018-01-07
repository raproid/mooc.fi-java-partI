
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random randomizer;
    private int number;
    private int guessUpperLimit;
    private int guessLowerLimit;
    private int maxNumbers;

    public LotteryNumbers() {
        this.drawNumbers();

    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    //define custom limits, then while the array length hasn't reached the max length per draw do this:
    //guess a random number, make sure it's never 0, check the array doesn't have it already, if so add it to the array
    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.randomizer = new Random();

        guessLowerLimit = 1;
        this.guessUpperLimit = 39;
        this.maxNumbers = 7;

        for (int i = 0; numbers.size() < maxNumbers; i++) {
            number = randomizer.nextInt(guessUpperLimit) + guessLowerLimit;
            if (!containsNumber(number) && numbers.size() < maxNumbers) {
                numbers.add(number);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
