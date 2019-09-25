import java.util.Scanner;

//Write a Java program to generate random integers in a specific range.
public class RandomSpecificRange {

    public static void main(String[] args) {
        getRandomSpecificRange();
    }

    public static void getRandomSpecificRange() {

        Scanner in = new Scanner(System.in);
        int start, end;

        System.out.println("Java Program to Generate Random No from specific Range");
        System.out.print("Enter starting no of range : ");
        start = in.nextInt();
        System.out.print("Enter finishing no of range : ");
        end = in.nextInt();


       // in.close();
        double random = (int) (Math.random() * ((end - start) + 1) + start);
        System.out.println("\nRandom No between " + start + " and " + end + " = "+random );

    }

}


