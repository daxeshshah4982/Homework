/* Write a program in Java to display the pattern like triangle with a number.
       Input number of rows: 10
        Expected Output:
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910
 */

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        pt();
    }

    public static void pt() {
        System.out.println("Enter any number : ");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
