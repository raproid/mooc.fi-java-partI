
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //print all whole numbers from 1 to the number the user enters
        System.out.println("Up to what number?");
        int number = 1;
        int limitNumber = Integer.parseInt(reader.nextLine());     
        while (number <= limitNumber){
            System.out.println(number);
            number++;
        }
    }
}
