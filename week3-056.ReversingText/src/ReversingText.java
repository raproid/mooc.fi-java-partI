
import java.util.Scanner;

public class ReversingText {

    /*I've done ex. 50 to 55 in clean code, but since my implementation doesn't 
    pass the specific built-in course tests, I'm gonna write in crude code 
    that this course understands
     */
    public static String reverse(String text) {
        int textLength = text.length();
        StringBuilder builder = new StringBuilder(textLength);
        for (int i = text.length() - 1; i >= 0; i--) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
