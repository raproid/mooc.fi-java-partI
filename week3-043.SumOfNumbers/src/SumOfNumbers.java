public class SumOfNumbers {

    public static int sum(int number1, int number2, int number3, int number4) {
        //trying out methods that return sth
        int result = number1 + number2 + number3 + number4;
        return result;
    }
//invoking method with user parameters
    public static void main(String[] args) {
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
    }
}
