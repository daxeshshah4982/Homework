import java.util.Arrays;
import java.util.Scanner;

//Write a Java program to reverse an array of integer values.
public class ReverseArrayInteger {
    public static void main(String[] args) {
        reverse();
    }

    public static void reverse() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scr.nextInt();

        // declaration of array
        int[] a = new int[n];

        // input the values of array
        System.out.println("Enter an array values : ");
        for (int i = 0; i < n; i++) {
            a[i] = scr.nextInt();            // user can enter the values in array(creating own array)
        }
        System.out.println("array elements are "+ Arrays.toString(a));

        int start = 0;
        int end = n - 1;
        int temp ;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }System.out.println("array elements after reversing :"+ Arrays.toString(a));
        // elements of array after reverse
//        for (int j =0;j<n; j++){
//            System.out.print(" "+ a[j]);
//        }
    }
}
