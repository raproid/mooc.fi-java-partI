
import java.util.Random;

public class Least {
//define the least 
    public static int least(int number1, int number2) {
        int result;
        if (number1 < number2) {
            result = number1;
        } else if (number1 > number2) {
            result = number2;
        } else {
            //for lulz
            Random random = new Random();
            result = random.nextBoolean() ? number1 : number2;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
