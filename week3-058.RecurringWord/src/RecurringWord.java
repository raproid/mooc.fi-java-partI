
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        ArrayList<String> userWords = new ArrayList<String>();
/* Just some redundant procedural code because of the embedded tests. 
The course requirements for points are such that they don't favor, let's say, "complications"*/
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String userInput = reader.nextLine();
        userWords.add(userInput);

        while (true) {
            //recursively ask user for a word
            System.out.println("Type a word:");
            userInput = reader.nextLine();
            //until the user input matches a value in the array of words
            if (userWords.contains(userInput)) {
                break;
                // add the word to the array of words for indexing
            } else {
                userWords.add(userInput);
            }
        }
        System.out.println("You gave twice the word " + userInput + " twice");
    }
}
