
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        String userName = askUserName();
        String reverseName = calculateReverseName(userName);
        Print(reverseName);
    }

    public static void Print(String text) {
        System.out.println(text);
    }

    public static String askUserName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        return name;
    }

    public static String calculateReverseName(String text) {
        int length = text.length();
        StringBuilder builder = new StringBuilder(length);
        for (int i = (length - 1); i >= 0; i--) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }
}
