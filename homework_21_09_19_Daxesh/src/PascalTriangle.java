import java.util.Scanner;

/*Write a Java program to display Pascal's triangle.
Input number of rows: 5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 */
public class PascalTriangle {
    public static void main(String[] args) {
        pascal1();
        pascal2();
    }

    //method 1 (useful up to n =8 only)
    public static void pascal1() {
        int n = 5;
        for (int i = 0; i <= n - 1; i++) {
            int j = (int) Math.pow(11, i);
            System.out.println(j +" ");
        }
    }

    //method 2
    public static void pascal2() {
        System.out.println("Enter no. of lines : ");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();

        int spaces = number;
        int value = 1;
        for (int i = 0; i < number; i++) {
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }spaces--;
            System.out.println();

        }

    }
}

