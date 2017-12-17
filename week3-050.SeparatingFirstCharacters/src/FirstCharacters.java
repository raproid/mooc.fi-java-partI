
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        String userName = askUserName();
        if (userName.length() > 2) {
            calculateAndPrintFirstThreeCharacters(userName);
        } else {
        }
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

    public static void calculateAndPrintFirstThreeCharacters(String text) {
        for (int i = 0; i < 3; i++) {
            char character = calculateCharacter(text, i);
            Print((i + 1), ". character: ", character);
        }
    }
}
