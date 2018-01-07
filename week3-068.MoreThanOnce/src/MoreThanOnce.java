
import java.util.ArrayList;
import java.util.Scanner;

public class MoreThanOnce {

    //find out if the array has two repeated values  
    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int repeated = 0;
        for (int number : list) {
            if (number == searched) {
                repeated++;
            }
            if (repeated >= 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}
