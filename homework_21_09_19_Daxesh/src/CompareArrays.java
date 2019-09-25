//Write a program to compare two array and its elements are same or not?
public class CompareArrays {
    public static void main(String[] args) {
        if(compare() == false){
            System.out.println("different array");
        }else {
            System.out.println("same array");
        }
    }
    public static boolean compare(){
        int[] a = {1,2,3,4,5,6,7};
        int[] b = {1,2,3,4,5,6,7};

        if(a.length != b.length){
            return false;
        }
        for (int i = 0; i <a.length ; i++) {
            if (a[i] != b[i]){
                return false;
            }

        }return true;
    }


}
