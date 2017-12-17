import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        String userName = askUserName();
        char lastLetter = lastCharacter(userName);
        Print("Last character: ", lastLetter);               
    }
    
    public static void Print(String text, char character) {
        System.out.println(text + character);
    }
           
    public static String askUserName(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        return name;
}
    public static char lastCharacter(String text) {
        char lastChar = text.charAt(text.length() -1);
        return lastChar;
    }
}
