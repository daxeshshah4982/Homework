/*left angle triangle of @ using nested for loops
 */
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        lt();
    }
    public static void lt(){
        System.out.println("Enter a odd no. for thickness of the diamond");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        int mid = (number + 1) / 2;
        for (int i = 1; i <=number ; i++) {
            for (int s = 1; s <=number-i ; s++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
