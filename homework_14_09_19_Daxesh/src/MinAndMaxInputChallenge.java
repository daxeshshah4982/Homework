import java.util.Scanner;

/*-Read the numbers from the console entered by the user and print the minimum and
maximum number the user has entered.
-Before the user enters the number, print the message •Enter number: •
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        wlop();
    }

    public static void wlop() {

        int num = 0;
        int min = 0;
        int max = 0;

        System.out.println("Enter no. : ");
        Scanner scr = new Scanner(System.in);
        num = scr.nextInt();
        max = num;
        min = num;

        while (num >= 0) {

            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
            System.out.println("Enter no. : ");
            num = scr.nextInt();
        }

        System.out.println("Minimum no is : " + min + " and maximum no. is : " + max);


    }


}
