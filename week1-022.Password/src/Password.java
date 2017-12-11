
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String secret = "jryy qbar!";
        String password = "carrot";
//ask user for a password and keep asking until they give the right one to obtrain the secret
        while (true) {
            System.out.println("Type the password:");
            password = reader.nextLine();

            if (password.equals("carrot")) {
                System.out.println("\n" + "Right!");
                break;
               
            } else if (!password.equals("carrot")) {
                System.out.println("Wrong!");
                System.out.println("\n");
                System.out.println("Try one more time!");
            }
        }
        
        System.out.println("Here is the secret!" + "\n" + "The secret is: " + secret);
    }
}
