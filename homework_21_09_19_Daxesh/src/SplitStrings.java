//Write a program to split the string?
public class SplitStrings {
    public static void main(String[] args) {
split();
    }
    public static void split(){
        String str = "Give me some sunshine, Give me some rain";
        String[] parts = str.split(" ");

        for (int i = 0; i <parts.length ; i++) {
            System.out.println("------>"+parts[i]);

        }
    }
}
