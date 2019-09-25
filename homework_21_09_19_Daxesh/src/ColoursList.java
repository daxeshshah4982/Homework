import java.awt.*;
import java.util.Arrays;
import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colours (string) and
printout the collection.
 */


public class ColoursList {


    public static void main(String[] args) {
        colours();
    }
    public static void colours(){
        ArrayList<String> color = new ArrayList<>();

        color.add("Blue");
        color.add("Red");
        color.add("Purple");
        color.add("Pink");
        color.add("Yellow");
        color.add("White");
        color.add("Black");
        System.out.println("2nd element of color array is : "+color.get(2));

        int colorSize = color.size();
        System.out.println("Total colours are : "+colorSize);

        System.out.print("List of color array elements : ");
        for (int i=0;i<colorSize;i++){
            System.out.print(color.get(i) + " , ");
        }
    }
}
