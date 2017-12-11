
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int userInputNumber;
        int sumOfAllUserInput = 0;
        int countOfUserInput = 0;
        double averageOfAllUserInput = 0.0;
        int countUserOddNumbers = 0;
        int countUserEvenNumbers = 0;
        System.out.println("Type numbers:");
        
        //keep asking user input until it's -1 and the loop is broken
        while (true) {

            userInputNumber = Integer.parseInt(reader.nextLine());
            
            if (userInputNumber == -1) {
                break;
            }
            // count even number from user input
            else if (userInputNumber % 2 == 0) {
            countUserEvenNumbers++;
            }
            //count odd numbers from user input
            else if (userInputNumber % 2 != 0) {
            countUserOddNumbers++;
            }
            //calculate sum of all user input
            sumOfAllUserInput += userInputNumber;
            //count user input
            countOfUserInput++;
            //calculate average of user input
            averageOfAllUserInput = (double) sumOfAllUserInput / countOfUserInput;
            System.out.println("Type numbers:");
           

        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sumOfAllUserInput);
        System.out.println("How many numbers: " + countOfUserInput);
        System.out.println("Average: " + averageOfAllUserInput);
        System.out.println("Even numbers: " + countUserEvenNumbers);
        System.out.println("Odd numbers: " + countUserOddNumbers);
    }
}
