
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        
       Scanner reader = new Scanner(System.in);
        
       System.out.println("Let's calculate a sum of two numbers!");
       
        System.out.println("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
       
        System.out.println("Type another number: ");       
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        int result = firstNumber + secondNumber;
        
        System.out.println("Sum of the numbers: " + result);
       
    }
}