import java.util.Scanner;

/*Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        fn();
    }

    public static void fn() {
        int n1 = 0;
        int n2 = 1;
        int number = 2;
        System.out.println("Enter a no. up to you want to print fibonacci series : ");
        Scanner scr = new Scanner(System.in);
        int count = scr.nextInt();
        System.out.print(n1 + "," + n2);
        for (int i = 2; i <= count; i++) {

            number = n1 + n2;
            System.out.print("," + number);
            n1 = n2;
            n2 = number;

        }


    }
}

