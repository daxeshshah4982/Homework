/*20. Write a Java program to reverse elements in a array list.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayElementList {
    public static void main(String[] args) {
        revArrEle();
    }

    public static void revArrEle() {
        ArrayList<Integer> con = new ArrayList<>();

        con.add(56);
        con.add(45);
        con.add(12);
        con.add(95);
        con.add(25);
        con.add(72);
        con.add(32);
        con.add(99);
        con.add(86);
        con.add(67);
        con.add(36);
        con.add(29);
//way to make an array from array elements :
        Object[] abc = con.toArray();
        System.out.println(Arrays.toString(abc));

        // way to find array elements
 //        System.out.print("Elements in array count are : ");
//        for (int i = 0; i <= con.size() - 1; i++) {
//            System.out.print(con.get(i) + " , ");
//        }
    // here creating integer last number is nothing but length of array size
        int lastNumber = con.size();

        //Reversing an array element
        int temp = lastNumber;
        int xyz[] = new int[lastNumber];

        for(int i=0; i<lastNumber; i++){
            xyz[temp-1] = (int) abc[i];
            temp =temp- 1;
        }
        System.out.print("array elements after reversing :" + Arrays.toString(xyz));
    }
}

