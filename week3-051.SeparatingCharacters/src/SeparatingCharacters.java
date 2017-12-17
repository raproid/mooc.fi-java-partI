
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        String userName = askUserName();
        separateUserInputIntoCharactersAndPrintThem(userName);
    }

    public static void Print(int position, String text, char character) {
        System.out.println(position + text + character);
    }

    public static String askUserName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        return name;
    }

    public static char calculateCharacter(String text, int i) {
        char character = text.charAt(i);
        return character;
    }

    public static void separateUserInputIntoCharactersAndPrintThem(String text) {
        for (int i = 0; i <= text.length()-1; i++) {
            char character = calculateCharacter(text, i);
            Print((i + 1), ". character: ", character);
        }
    }
}
