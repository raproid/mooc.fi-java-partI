
public class AverageOfGivenNumbers {
    
    // calculate the sum of 4 numbers
    public static int sum(int number1, int number2, int number3, int number4) {
      int  result = number1 + number2 +number3 + number4;
        return result;
    }
//use sum in calculation of the average of those numbers
    public static double average(int number1, int number2, int number3, int number4) {
        double result = (double) sum(number1, number2, number3, number4) / 4;
        return result;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
