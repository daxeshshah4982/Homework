import java.util.Scanner;

/*12. Write a programme to input any number and check if it is prime number or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */
public class PrimeNo {
    public static void main(String[] args) {
        prime();
    }

    public static void prime() {

        System.out.println("Enter any no up to you want to see prime no.s : ");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();

        int temp = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 1) {
            System.out.println(n + " is not a prime no.");
        } else {
            System.out.println(n + " is a prime no.");
        }

    }

}