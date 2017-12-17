
import java.util.Scanner;

public class LengthOfName {

    public static void main(String[] args) {
        //ask user for a name
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String userName = reader.nextLine();
        //calculate name length
        int nameLength = calculateCharacters(userName); 
        System.out.println("Number of characters: " + nameLength);
    }

    public static int calculateCharacters(String text) {
        int length = text.length();
        return length;
    }
}
