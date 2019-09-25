/*Write a Java program to display the number rhombus structure. Go to the editor
Input the number: 7 Expected Output :
1
212
32123
4321234
543212345
65432123456
7654321234567
65432123456
543212345
4321234
32123
212
1

 */
import java.util.Scanner;


public class RhombusIntegerStructure {
    public static void main(String[] args) {
        rhom();
    }

    public static void rhom() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any no to make Rhombus : ");
        int number = scr.nextInt();

        for (int i = 1; i <=number ; i++) {
            for (int s = number -i; s >=0 ; s--) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int k =2 ; k <=i ; k++) {
                System.out.print(k);
            }
            System.out.println();
            
        }
        for (int i = number-1; i >=1 ; i--) {
            for (int s =0 ; s <=number -i ; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <=i ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
