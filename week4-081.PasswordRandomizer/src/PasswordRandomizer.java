
import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {

    private Random randomizer;
    private int length;
    private int number;
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        this.length = length;
        this.number = 0;
        this.randomizer = new Random();
    }

    //create an empty string and, while not exceeding the user-set password length, do this: 
    //guess a random number within the alphabet length, find the char by that number in the alphabet, append the char to password
    public String createPassword() {
        String password = "";
        for (int i = 0; i < this.length; i++) {
            number = randomizer.nextInt(alphabet.length());
            char symbol = alphabet.charAt(number);
            password += symbol;
        }
        return password;
    }
}
