import java.util.Arrays;

public class ArraySortIS {
    public static void main(String[] args) {
        sais();
    }
    public static void sais(){
        int []a = {1235,554,78,36,296,45,78,456,135,789,};
        String []str = {"Bablu","daxesh","Amit","Chako","Paresh","Daxesh","amit"};
        Arrays.sort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i] +" , ");
        }
        System.out.println();
        Arrays.sort(str);
        for (int i = 0; i <str.length ; i++) {
            System.out.print(str[i] +" , ");

        }
    }
}
