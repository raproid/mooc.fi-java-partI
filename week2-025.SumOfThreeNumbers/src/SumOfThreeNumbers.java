
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable

        System.out.println("Type three numbers to calculate their sum.");
        System.out.println("Type the first number:");
        int firstNumber = Integer.parseInt(reader.nextLine());
        read = firstNumber;
        System.out.println("Type the second number:");
        int secondNumber = Integer.parseInt(reader.nextLine());
        read = read + secondNumber;
        System.out.println("Type the third number:");
        int thirdNumber = Integer.parseInt(reader.nextLine());
        read = read + thirdNumber;
        sum = read;
        System.out.println("Sum: " + sum);
    }
}
