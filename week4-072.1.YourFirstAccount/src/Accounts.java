
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account userAccount = new Account("Olle's", 100.0);
      
        userAccount.deposit(20.0);
        System.out.println(userAccount.toString());
    }

}
