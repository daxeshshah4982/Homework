import java.util.ArrayList;
import java.util.Scanner;

//19. Write a Java program to retrieve an element (at a specified index) from a given
//array list
public class RetrieveElement {
    public static void main(String[] args) {
        ret();
    }

    public static void ret() {
        ArrayList<String> companyList = new ArrayList<>();

        companyList.add("TCS");
        companyList.add("Cognizant");
        companyList.add("Cyber Infrastructure");
        companyList.add("Birla");
        companyList.add("Sunflower");
        companyList.add("India NIC");

        System.out.println("Enter a no. to see the company at the rank : ");
        Scanner scr = new Scanner(System.in);
        int i = scr.nextInt();
        if (i <= companyList.size()) {
            System.out.println(companyList.get(i));
        } else {
            System.out.println("No company in the list at that rank");
        }
    }
}
