import java.util.Scanner;

//Write a program for ascending order of the number?
public class AscendingOrder {
    public static void main(String[] args) {
        asc();
    }

    public static void asc() {
        int temp = 0;
        System.out.print("\nEnter any no. n : ");
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();

        // declare and initialize array from user
        int[] a = new int[number];

        // get array elements from user
        System.out.println("Enter " + number + " numbers for array elements");
        for (int i = 0; i < number; i++) {
            a[i] = scr.nextInt();
        }

        //print array elements
        System.out.print("Array elements are : ");
        for (int i = 0; i < number; i++) {
            System.out.print(a[i] + "  ");
        }

        // ascending order logic
        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j <number; j++) {
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        // array in ascending order
        System.out.println();
        System.out.print("Arrays in ascending order : ");
        for (int i = 0; i < number ; i++) {
            System.out.print("  " +a[i] );
        }

        // arrays in descending order logic
        for (int i = 0; i <number ; i++) {
            for (int j = i + 1; j < number; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }// print descending oder
        System.out.println();
        System.out.print("Arrays in descending order : ");
        for (int i = 0; i <number ; i++) {
            System.out.print(a[i] +"  ");

        }

    }
}
