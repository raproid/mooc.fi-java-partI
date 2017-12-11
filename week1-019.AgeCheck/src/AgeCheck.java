import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
//ask user for their age and assess if it is within a reasonable span (e.g. 0 to 120)        
        System.out.println("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        }
        else {
             System.out.println("Impossible!");
             System.out.println("Foedissimus daemon barathi, putrissima strix, infernum adigo, condemno, damno!" + "\n" + "Impero Expelleris! Eximeris! Aboleris!");
            
        }

    }
}
