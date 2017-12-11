
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //total sum with the min and max defined by the user 
        System.out.println("Let's calculate the total sum! Choose a range of numbers:");
        System.out.println("First:");
        int firstUserNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Second:");
        int secondUserNumber = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        int i = firstUserNumber;
        
        while ( i <= secondUserNumber) {
        result += i;
        i++;
        }
        
        System.out.println("The sum is " + result);
        
    }
}
