
public class EvenNumbers {

    public static void main(String[] args) {
        //  print all even numbers between 2 and 100.
        int number = 2;
        while (number <= 100) {
            /* if (number % 2 == 0) {
                System.out.println(number);
            }
            number++; too many unnecessary operations */
            System.out.println(number);
            number += 2;
            
        }
    }
}
