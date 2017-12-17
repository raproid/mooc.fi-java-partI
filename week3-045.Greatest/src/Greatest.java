
import java.util.Random;
import java.lang.Math;

public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
//find out which number is greatest
        int result;
        int max = Math.max(number1, number2);
        if (number1 == number2 && number2 == number3) {
            //randomizer for lulz
            int[] numbersInArray = {number1, number2, number3};
            int random = (int) (Math.random() * numbersInArray.length);
            result = numbersInArray[random];
        } else if (max > number2) {
            result = Math.max(number1, number3);
        } else {
            result = Math.max(number2, number3);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
