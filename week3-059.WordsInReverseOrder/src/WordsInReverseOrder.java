
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //create an empty list
        ArrayList<String> userWords = new ArrayList<String>();
        while (true) {
            //keep asking the user for words and add them to the list intil an empty line
            System.out.println("Type a word:");
            String userInput = reader.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            userWords.add(userInput);
        }
        //reverse the order and print the user input 
        Collections.reverse(userWords);
        System.out.println("You typed the following words:");
        for (String word : userWords) {
            System.out.println(word);
        }

    }

}
