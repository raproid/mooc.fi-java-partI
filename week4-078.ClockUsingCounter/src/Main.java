
import java.util.Scanner;

public class Main {

    public static void main(String[] args) /* throws InterruptedException */ {
        // uncomment the exception throw in case wanna actiavte the advanced clock emulator 
        
        //a simple clock emulator; for real life clock emulator scroll down to the advanced clock emulator
        Scanner userInputReader = new Scanner(System.in);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter seconds = new BoundedCounter(59);

//read initial user values of seconds, minutes and hours
        System.out.print("seconds: ");
        int s = userInputReader.nextInt();
        System.out.print("minutes: ");
        int m = userInputReader.nextInt();
        System.out.print("hours: ");
        int h = userInputReader.nextInt();

//set the read values
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

//when seconds reach 59 and reset to 0 add one minute, and when minutes reach 59 and reset to 0 add one hour 
        int counter = 0;
        while (counter < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
            counter++;
        }
    }
}

//advanced clock emulator
     /* Scanner reader = new Scanner(System.in);
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter seconds = new BoundedCounter(59);

//read initial user values of seconds, minutes and hours
        System.out.print(
                "seconds: ");
        int s = reader.nextInt();

        System.out.print(
                "minutes: ");
        int m = reader.nextInt();

        System.out.print(
                "hours: ");
        int h = reader.nextInt();

//set the read values
        seconds.setValue(s);

        minutes.setValue(m);

        hours.setValue(h);

//sleep for one second; then advance seconds by 1 repeatedly till 59; then advance minutes till 59; then advance hours till 23  
        while (true) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
            }
        }
    }
} */


//simple repetitive counter with a user defined upper limit
        /* BoundedCounter counter = new BoundedCounter(4);
        System.out.println("Value at start: " + counter);

        int i = 0;
        while (i < 121) {
            counter.next();
            System.out.println("Value: " + counter);
            i++;
        }
    }
} */
