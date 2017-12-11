
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // ask user for their age and tell if it is a legal age (e.g. >=18)
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        
        if (age < 18 ) {
            System.out.println("You have not reached the age of majority yet!");
        }
        else {
            System.out.println("You have reached the age of majority!");
        }
        
    }
}
