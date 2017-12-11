
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //ask the user for the first number and the last number and then prints all numbers between those two
        System.out.println("First:");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Last:");
        int lastNumber = Integer.parseInt(reader.nextLine());
        
        while (firstNumber <= lastNumber) {
            System.out.println(firstNumber);
            firstNumber++;
           
            if (firstNumber > lastNumber) {
                System.out.println();
            }
        }
    }

}
