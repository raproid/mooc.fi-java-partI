
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //calculate the amount of user inputs, sum and average of all the inputted    numbers
        /* NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
         */

        Scanner userInputReader = new Scanner(System.in);
        NumberStatistics allNumbers = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();

        System.out.println("Type numbers:");
//read numbers from user input until -1 and then print the sum of all, even and odd
        while (true) {
            int userInput = userInputReader.nextInt();
            if (userInput == -1) {
                break;
            }
            allNumbers.addNumber(userInput);
            if (userInput % 2 == 0) {
                evenNumbers.addNumber(userInput);
            } else {
                oddNumbers.addNumber(userInput);
            }
        }
        System.out.println("sum: " + allNumbers.sum());
        System.out.println("sum of even: " + evenNumbers.sum());
        System.out.println("sum of odd: " + oddNumbers.sum());
    }
}
