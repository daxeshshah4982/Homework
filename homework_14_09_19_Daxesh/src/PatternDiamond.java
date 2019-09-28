/* Write a program in Java to display the pattern like a diamond.
While loop
 */

import java.util.Scanner;

public class PatternDiamond {
    public static void main(String[] args) {
        pd();
    }

    public static void pd() {

        System.out.println("Enter a odd no. for thickness of the diamond");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        int mid = (number + 1) / 2;
        int i = 1;
        while (i <= mid) {

            int s = 1;
            int j = 1;
            while (s <= (mid - i)) {
                System.out.print(" ");
                s++;
            }
            while (j <= ((2 * i) - 1)) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }

        for (i = 1; i <= (mid - 1); i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= 2 * (mid - i) - 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

