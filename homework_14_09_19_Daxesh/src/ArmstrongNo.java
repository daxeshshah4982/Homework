import java.util.Scanner;

/*Write a program to input any number and check if it Armstrong number or not
        153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153
 */
public class ArmstrongNo {
    public static void main(String[] args) {
        arm();
    }

    public static void arm() {

        int j = 0;
        int sum = 0;
        int rem = 0;
        System.out.println("Enter any no.");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
<<<<<<< HEAD

        int temp = number;
        if (number >= 0) {
            while (number > 0 ) {
=======
        int temp = number;
        if (number >= 0) {
            while (number > 0) {
>>>>>>> 5fe05db202f4aaad4f9ed2cd5d363e0dea529473
                rem = number % 10;
                number = number / 10;
                j = rem * rem * rem;
                sum = sum + j;
            }
            if (temp == sum) {
<<<<<<< HEAD
                System.out.println(temp + " is an Armstrong no.");
=======
                System.out.println(number + " is an Armstrong no.");
>>>>>>> 5fe05db202f4aaad4f9ed2cd5d363e0dea529473
            } else {
                System.out.println(temp + " is not an Armstrong no.");
            }
        }
    }


}
