/*16. Write a Java program to print the following grid.
Expected Output :
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
 */

import java.util.Scanner;

public class Grid {
    public static void main(String[] args) {
gridLength();
    }
    public static void gridLength(){
        System.out.println("Enter the length, would like to keep for grid : ");
        Scanner scr = new Scanner(System.in);
        int length = scr.nextInt();
        for (int i = 0; i <=length ; i++) {
            System.out.println("----------");

        }
    }

}
