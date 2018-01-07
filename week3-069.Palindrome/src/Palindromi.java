
import java.util.Scanner;

public class Palindromi {

    //reverse the word from user input, compare reverse to the original word and if the same, say the word is a palindrome
    public static boolean palindrome(String text) {
        String reverse = "";
        for (int i = 1; i <= text.length(); i++) {
            reverse += text.charAt(text.length() - i);
        }
        if (text.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
