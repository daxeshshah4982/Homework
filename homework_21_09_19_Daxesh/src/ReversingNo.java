import java.util.Scanner;

//Write a program to reverse the given number?
public class ReversingNo {
    public static void main(String[] args) {
        reverse();
    }

    public static void reverse() {
        System.out.println("Enter any no. you want to reverse : ");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        int rem = 0;
        int rev = 0;
        int temp = number;

        while (number != 0) {
            rem = number % 10;
            rev = rem + rev * 10;
            number = number / 10;
        }

        System.out.println("Reverse no of given no " + temp + " is : " + rev);

    }
}




