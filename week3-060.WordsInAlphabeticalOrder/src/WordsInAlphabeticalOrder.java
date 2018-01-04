
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> userWords = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word:");
            String userInput = reader.nextLine();
            userWords.add(userInput);
            if (userInput.isEmpty()) {
                break;
            }
        }
        Collections.sort(userWords);
        System.out.println("You typed the following words:");
        for (String word : userWords) {
            System.out.println(word);
        }
    }
}
