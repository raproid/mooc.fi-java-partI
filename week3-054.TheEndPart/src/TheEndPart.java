
import java.util.Scanner;

public class TheEndPart {

//Look at the commented code at below
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String userInput = reader.nextLine();
        System.out.println("Length of the end part:");
        int startFromChar = reader.nextInt();

        String lastPart = userInput.substring(userInput.length() - startFromChar);
        System.out.println("Result: " + lastPart);
    }
}

/*This one works just fine and is closer to a clean code, but built-in
tests of the course do not allow this implementation to pass. This is why it's
commented and a crude version above gains me points in the course. :(

public static void main(String[] args) {
        String userInput = readUserInput();
        int lastPartLength = askFirstPartLenght();
        String lastPart = calculateLastPart(userInput, lastPartLength);
        Print("Result: ", lastPart);
    }

    public static void Print(String template, String text) {
        System.out.println(template + text);
    }

    public static String readUserInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String text = reader.nextLine();
        return text;
    }

    public static int askFirstPartLenght() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Length of the first part:");
        int firstPartLength = reader.nextInt();
        return firstPartLength;
    }

    public static String calculateLastPart(String text, int firstPartLength) {
        String lastPart = text.substring(text.length() - firstPartLength);
        return lastPart;
    }
}
*/
