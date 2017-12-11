
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //calculates sum of the powers with a user-defined power
        System.out.println("Let's calculate the sum of the powers! Define the power value!");
        System.out.println("Type a number:");
        int userChoosePower = Integer.parseInt(reader.nextLine());
        int number = 2;
        int i = 0;
        int sum = 0;
             
        while (i <= userChoosePower){
        sum += (int) Math.pow(number, i);
        i++;        
        }
        System.out.println("The result is " + sum);
    }
}
