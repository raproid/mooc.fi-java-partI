import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //ask user for two numbers, compare them and give the greater one or say they're equal
        System.out.println("Type the first number:");
        int firstNumber = Integer.parseInt(reader.nextLine());
       
        System.out.println("Type the first number:");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println("Greater number: " + firstNumber);
        }
        else if (secondNumber > firstNumber) {
        System.out.println("Greater number: " + secondNumber);
        }
        else {
            System.out.println("The numbers are equal!");
        }
     }
}
