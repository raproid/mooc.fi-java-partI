
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            //keep asking user for a word
            System.out.println("Type a word:");
            String userInput = reader.nextLine();
            //untill the input is empty
            if (userInput.equals("")) {
                break;
            //add user input to the string array
            } else {
                words.add(userInput);
            }
        }
        //print user input in lines - each value in the array as a new line
        for (String word : words) {
            System.out.println("You typed the following words:a");
            System.out.println(word);
        }
    }
}
