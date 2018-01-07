
import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int newNumber) {
        amountOfNumbers++;
        this.sum += newNumber;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return (double) this.sum / this.amountOfNumbers;
        }
    }
}
