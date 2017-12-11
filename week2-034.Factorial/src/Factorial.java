import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //calculate the factorial of the number n
        System.out.println("Let's calculate a factorial! Choose a number!");
        System.out.println("Type a number:");
        int userChooseFactorial = Integer.parseInt(reader.nextLine());
        
       int result = 1;
       int i = 1;
       while (i <= userChooseFactorial) {
           result *= i;
           i++;
       }
        System.out.println("Factorial is " + result);
    }
}
