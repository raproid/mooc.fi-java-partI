
import java.util.Scanner;

public class ManyPrints {

    public static void main(String[] args) {
        /* sorry for the broken English, the course needs it to pass all built-in tests
        ask the user how many times the text should be printed*/
       // use the while structure to call the printText method several times
       displayTextTimesUserInput();

    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void displayTextTimesUserInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int userInput = reader.nextInt();
        int i = 0;
        while (i < userInput) {
        printText();
        i++;} 
           

    }
    
}
