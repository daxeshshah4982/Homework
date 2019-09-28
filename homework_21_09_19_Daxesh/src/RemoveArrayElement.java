import java.util.Arrays;

//Write a Java program to remove a specific element from an array.
public class RemoveArrayElement {
    public static void main(String[] args) {
        remove();
    }

    public static void remove() {
        int[] a = {1, 3, 5, 6, 8, 9, 7, 45, 788, 23, 65, 78, 4, 999};
        System.out.println("length of array element a is : "+a.length);

        System.out.print("array elements before removing the elements : " + Arrays.toString(a));
        //remove the element 2 (basically here 3rd in array list)

        a[2] = a[a.length - 1];
        int [] b = new int[a.length-1];

        for (int i = 0; i <a.length-1 ; i++) {
            b[i] = a[i];

        }
        System.out.println("\nlength of array elements after removing elements is : "+b.length);
        System.out.println("after removing array elements are :"+Arrays.toString(b));



    }
}
