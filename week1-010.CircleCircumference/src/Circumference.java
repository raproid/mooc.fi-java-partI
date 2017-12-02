import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Let's calculate a circle circumference!");
        
        System.out.println("Type the radius:");
        int circleRadius = Integer.parseInt(reader.nextLine());
        double Pi = Math.PI;
      
        double result = 2 * Pi * circleRadius;
        
        System.out.println("Circumference of the circle:" + result);

     }
}
