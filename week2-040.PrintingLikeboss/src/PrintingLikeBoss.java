
public class PrintingLikeBoss {

//method for printing stars
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
//method for printing whie spaces
    public static void printWhitespaces(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }
//print triangle
    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }

    }
// print a Christmas tree with a leg
    public static void xmasTree(int height) {
       int i = 1;
       while (i <= height){
            printWhitespaces(height - i);
            printStars(i+(i-1));
            i++;
       }
       for (int j = 1; j < 3; j++){
           printWhitespaces(height - 2);
           printStars(3);
       }
       
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
