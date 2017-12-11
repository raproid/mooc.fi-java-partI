
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//ask user for username and password and accept only if the pair is "alex - mightyducks" or "emily - cat"        
        System.out.println("Type your username:");
        String login = reader.nextLine();
        
        System.out.println("Type your password:");
        String password = reader.nextLine();
        
        if (login.equals("alex") && password.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
        }
        
        else if (login.equals("emily") && password.equals("cat")) {
            System.out.println("You are now logged into the system!");
        }

        else {
            System.out.println("Your username or password was invalid!");
        }
            

    }
}
