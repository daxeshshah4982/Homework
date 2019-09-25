import com.sun.org.apache.xerces.internal.impl.io.ASCIIReader;
import com.sun.xml.internal.ws.util.ASCIIUtility;
import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.Scanner;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.ASCII;
import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.DIGIT;

/*Write a Java program to display the following character rhombus structure.
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
ABCDEFEDCBA
ABCDEFGFEDCBA
ABCDEFEDCBA
ABCDEDCBA
ABCDCBA
ABCBA
ABA
A
 */
public class RhombusStructure {


    public static void main(String[] args) {
        rhombus();
    }

    public static void rhombus() {

        System.out.println("Enter a no : ");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= mid; i++)
        {
            for (int s = 1; s <= mid - i; s++)
            {
                System.out.print(" ");
            }
            int k = 64;
            for (int j = 1; j <= (2 * i - 1); j++)
            {
                if (j <= i) {
                    k = k + 1;
                } else {
                    k = k - 1;
                }
                char c = (char) k;
                System.out.print(c);
            }

            System.out.println();
        }


        //int k = 64;
        for (int i = 1; i < mid; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");

            }int k = 64;
            for (int j = 1; j <= 2 * (mid - i) - 1; j++) {

                if (j <= mid-i) {
                    k = k + 1 ;

                } else {
                    k = k - 1;

                }char c = (char) k;
                System.out.print(c);


            }
            System.out.println();


        }
    }

}
