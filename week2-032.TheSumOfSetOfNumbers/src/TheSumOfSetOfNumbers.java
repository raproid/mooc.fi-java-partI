
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int result = 0;
        int i = 0;
        //sum of n with natutral numbers where n from 0 to the user input  
        System.out.println("Until what?");
        int userChooseNumber = Integer.parseInt(reader.nextLine());
        while (i <= userChooseNumber){
            result += i;
            i++;
        }
        System.out.println("Sum is " + result);
    }
}
