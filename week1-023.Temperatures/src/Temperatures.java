
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        //ask user for a float and add it to the graph; the number should be in -30 to +40 range
        while (true) {
            System.out.println("Type a decimal number for temperature:");
            double temperature = Double.parseDouble(reader.nextLine());

            if (temperature > -30 && temperature < 40) {
                Graph.addNumber(temperature);
            } else {
                System.out.println("The number should be inbetween -30C and +40C.");
            }
        }

    }

}
