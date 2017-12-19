
import java.util.Scanner;

public class FirstPart {

    //Look at the commented code at below
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a word:");
        String userInput = reader.nextLine();

        System.out.println("Length of the first part:");
        int partLength = reader.nextInt();

        String firstPart = userInput.substring(0, partLength);

        System.out.println("Result: " + firstPart);
    }
}

/* This one works just fine and is closer to a clean code, but built-in
tests of the course do not allow this implementation to pass. This is why it's
commented and a crude version above gains me points in the course. :(

public static void main(String[] args) {
        String userInput = readUserInput();
        int firstPartLength = askFirstPartLenght();
        String firstPart = calculateFirstPart(userInput, firstPartLength);
        Print("Result: ", firstPart);
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

    public static String calculateFirstPart(String text, int firstPartLength) {
        String firstPart = text.substring(0, firstPartLength);
        return firstPart;
    }
} */
