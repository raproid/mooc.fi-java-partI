
import java.util.Scanner;

public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
//keep asking user for a number and print the sum recursively adding newly read value to the old sum
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            //here use previous sum value and add it to the new entered number
            sum += read;

            System.out.println("Sum now: " + sum);
            System.out.println("Add another number:");
        }

        System.out.println("Sum in the end: " + sum);
    }
}
