/*program to test if an array contains a specific value.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SpecificValue {
    public static void main(String[] args) {
        sv();
    }

    public static void sv() {
        int[] a = { 1,5 ,98 ,78 ,56 , 364, 45 ,75 ,63,26 , 78 ,69};
        System.out.println("Enter the value want to check is array or not : ");
        Scanner scr = new Scanner(System.in);
        int value = scr.nextInt();
        boolean isNumberPresent = false;
        int storeValue = 0;

        for (int i = 0; i <a.length-1 ; i++) {
            if (value == a[i]) {
                isNumberPresent = true;
                storeValue = a[i];
            }
        }
        if (isNumberPresent){
            System.out.println(storeValue + " is present in array");
        }else {
            System.out.println(value + " is not present in array");
        }
    }
}

