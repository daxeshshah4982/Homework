import java.util.ArrayList;
import java.util.Scanner;

/*
21. Write a Java program to empty an array list
 */
public class EmptyArrayList {
    public static void main(String[] args) {
        emp();
    }

    public static void emp() {


        ArrayList<String> empList = new ArrayList<>();
        empList.add("Daxesh");
        empList.add("Divyesh");
        empList.add("Gaurang");
        empList.add("Sachin");
        empList.add("Kaushik");

        System.out.println("Size of an array list of employee : " + empList.size());

        //empty the employee list
        empList.clear();

        System.out.println("Now Size of Employee List after clearing up : " + empList.size());
    }
}