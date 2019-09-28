import java.util.ArrayList;

/*Write a Java program to iterate through all elements in a array list.
 */
public class IterateElements {
    public static void main(String[] args) {
        itEl();
    }

    public static void itEl() {
        ArrayList<String> employeeName = new ArrayList<>();

        employeeName.add("Daxesh");
        employeeName.add("Divyesh");
        employeeName.add("Kaushik");
        employeeName.add("Gaurang");
        employeeName.add("Sachin");
        employeeName.add("Pratik");

        // iterate by using  for loop

        for (int i = 0; i < employeeName.size(); i++) {
            System.out.print(employeeName.get(i) + " , ");
        }
// iterate by using advance for loop
        System.out.println();
        for (String name : employeeName) {
            System.out.print(name + " , ");
        }

    }
}
