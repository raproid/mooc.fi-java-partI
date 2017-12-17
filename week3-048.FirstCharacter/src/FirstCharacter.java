import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String userName = reader.nextLine();
        //find first character in the user name
        char foundFirstChar = firstCharacter(userName);
        System.out.println("First character: " + foundFirstChar);
    }
    
     public static char firstCharacter(String text) {
         char firstChar = text.charAt(0);
         return firstChar;
     }
}
