
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //ask user for a year and assess if it is divisible by 4 and not by 100. Or by 400
        System.out.println("Type a year:");
        int year = Integer.parseInt(reader.nextLine());
        
        if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
            System.out.println("The year is a leap year.");}
        else {
            System.out.println("The year is not a leap year.");
        }
        
        

    }
}
