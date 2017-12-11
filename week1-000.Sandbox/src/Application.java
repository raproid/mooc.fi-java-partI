
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");

        while (true) {
            System.out.println("Enter a command (sum, diff, mult, div, quit):");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            System.out.println("Enter two numbers:");
            int first = Integer.parseInt(reader.nextLine());
            int second = Integer.parseInt(reader.nextLine());

            if (command.equals("sum")) {
                int sum = first + second;
                System.out.println("The sum of your numbers is: " + sum);
                System.out.println("\n");

            } else if (command.equals("diff")) {
                int diff = first - second;
                System.out.println("The difference of your numbers is: " + diff);
                System.out.println("\n");

            } else if (command.equals("mult")) {
                int mult = first * second;
                System.out.println("result of the first number multiplied by second is: " + mult);
                System.out.println("\n");

            } else if (command.equals("div")) {
                double div = (double)first / second;
                System.out.println("Result of the first number divided by second is: " + div);
                System.out.println("\n");
            }

        }
        System.out.println("Thank you! Bye-bye!");
    }
}
