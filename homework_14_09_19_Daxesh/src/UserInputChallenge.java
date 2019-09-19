/*
 Read 10 numbers from the console entered by the user and print the sum of those
numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number•. Continue reading until you have
read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message •Enter number #x:• where x represents the
count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be •Enter number #1:•, the next •Enter
number #2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.*/

import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {

        System.out.println("Sum of all entered digits is =" +uIC());
    }

    private static int uIC() {
        Scanner scr = new Scanner(System.in);
        int[] a;
        int sum = 0;
        int i = 0;
        a = new int[10];
        while (i < 10) {
            System.out.print("Enter a number #" + (i+1) + "= :");

            if (scr.hasNextInt()) {
                a[i] = scr.nextInt();
                sum = sum + a[i];
                i++;
            } else {
                System.out.println("Invalid number");
                scr.nextInt();
            }
        }
        scr.close();
        return sum;
    }
}












