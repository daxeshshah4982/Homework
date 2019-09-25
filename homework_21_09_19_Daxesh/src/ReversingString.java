//Write a program to reverse the string?
public class ReversingString {
    public static void main(String[] args) {
reverse();
    }

    public static void reverse() {

        String name = "daxesh";

        int length = name.length();
        String rev1 = " ";

        for (int i = length-1; i >=0 ; i--) {
            rev1 = rev1 + name.charAt(i);

        }
        System.out.println(rev1);

        String name1 = "Give me some sunshine, Give me some rain";
        int len = name1.length();
        String rev2 = " ";

        for (int i =len-1 ; i >=0 ; i--) {
            rev2 = rev2 + name1.charAt(i);

        }
        System.out.println(rev2);


    }
}
