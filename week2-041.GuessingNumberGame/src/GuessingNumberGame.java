
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
 //draw a random natural number
        int numberDrawn = drawNumber();
        Scanner reader = new Scanner(System.in);
        int guessCount = 0;
//take user input until it matches the number, give hints, show the number tries
        while (true) {
            System.out.println("Guess a number, guesses made: " + guessCount);
            int userGuess = reader.nextInt();
            guessCount++;
            
            if (userGuess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } 
            else if (userGuess < numberDrawn) {
                System.out.println("The number is greater");
            } 
            else if (userGuess > numberDrawn) {
                System.out.println("The number is lesser");
            }

        }
    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }

}
