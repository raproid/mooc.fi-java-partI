
import java.util.Scanner;

public class WordInsideWord {
    
//Look at the commented code at below
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word:");
        String firstUserWord = reader.nextLine();
        System.out.println("Type the second word:");
        String secondUserWord = reader.nextLine();
        if (firstUserWord.toLowerCase().contains(secondUserWord.toLowerCase())) {
            System.out.println("The word " + secondUserWord + " is found in the word " + firstUserWord);
        } else {
            System.out.println("The word " + secondUserWord + " is not found in the word " + firstUserWord);
        }
    }
}
/* This one works just fine and is closer to a clean code, but built-in
tests of the course do not allow this implementation to pass. This is why it's
commented and a crude version above gains me points in the course. :(   

public static void main(String[] args) {
        String firstUserWord = getFirstWord();
        String secondUserWord = getSecondWord();
        boolean ifFirstWordContainsSecond = findIfFirstContainsSecond(firstUserWord, secondUserWord);
        String answer = createMessage(ifFirstWordContainsSecond, firstUserWord, secondUserWord);
        Print(answer);
    }

    public static void Print(String text) {
        System.out.println(text);
    }

    public static String getFirstWord() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first word:");
        String firstUserWord = reader.nextLine();

        return firstUserWord;
    }

    public static String getSecondWord() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the second word:");
        String secondUserWord = reader.nextLine();
        return secondUserWord;
    }

    public static boolean findIfFirstContainsSecond(String firstUserWord, String secondUserWord) {
        return firstUserWord.toLowerCase().contains(secondUserWord.toLowerCase());
    }

    public static String createMessage(boolean isContained, String firstUserWord, String secondUserWord) {
        String answer;
        if (!isContained) {
            answer = "The word " + secondUserWord + " is not found in the word " + firstUserWord;
        } else {
            answer = "The word " + secondUserWord + " is found in the word " + firstUserWord;
        }
        return answer;
    }
}
 */
