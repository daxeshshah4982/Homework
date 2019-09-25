import java.util.ArrayList;

public class CheckEmptyOrNot {
    public static void main(String[] args) {
check();
    }
    public static void check(){
        ArrayList<String> empList = new ArrayList<>();
        empList.add("Daxesh");
        empList.add("Divyesh");
        empList.add("Gaurang");
        empList.add("Sachin");
        empList.add("Kaushik");

        System.out.println("is the employee list empty? : "+ empList.isEmpty());
        empList.clear();
        System.out.println("After clearing, is the employee list empty? : " + empList.isEmpty());


    }
}
