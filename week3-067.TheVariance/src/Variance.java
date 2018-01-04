
import java.util.ArrayList;

public class Variance {

    // calculate the sum of all values from the list
    public static int sum(ArrayList<Integer> list) {
        int result = 0;
        for (int number : list) {
            result += number;
        }
        return result;
    }

    // calculate the average of list
    public static double average(ArrayList<Integer> list) {
        return (double) sum(list) / list.size();
    }

    /* calculate the sample variance of the list using the formula: 
       
       ∑(list[n] - average(list))²
       ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
           (list.size() -1)  
     */
    public static double variance(ArrayList<Integer> list) {
        double variance;
        double temp = 0;
        double average = average(list);
        for (int number : list) {
            temp += Math.pow((number - average), 2);
        }
        variance = temp / (list.size() - 1);
        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + variance(list));
    }
}
