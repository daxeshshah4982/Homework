package inheritanceHomework;

public class CallingAllClasses extends Average {
    public CallingAllClasses(int a, int b) {
        super(30, 35);
    }

    public static void main(String[] args) {

        CallingAllClasses cac1 = new CallingAllClasses(12, 20);

        int result1 = cac1.addition(12, 13, 10);
        int result2 = cac1.subtraction(45, 23, 2);
        int result3 = cac1.multi(10, 5, 5);
        double result4 = div(75.56, 7.565, 2.35);
        String result5 = cac1.strAdd("Daxesh", 49);
        double result6 = avg(89, 56);
        int result7 = cac1.addition(45, 39);
        int result8 = cac1.subtraction(45, 23, 2);
        int result9 = cac1.subtraction(457, 65);
        int result10 = cac1.multi(10,5,5);
        double result11 = div(12.56,5.3);
        String result12 = cac1.strAdd("Daxesh",49);

        System.out.println("addition object :" + result1);
        System.out.println("subtraction object :" + result2);
        System.out.println("multiplication object :" + result3);
        System.out.println("division object :" + result4);
        System.out.println("Concatenation object string and integer :" + result5);
        System.out.println("average object :" + result6);
        System.out.println(" for method overriding need same signature - means same method name and same no of arguments");
        System.out.println("Which will override original parent class and give result from child class only");
        System.out.println("method overloading for addition in parent class itself with same name and different argument :" + result7);
        System.out.println("method overriding for subtraction in child class Average with same name and less no. of argument :" + result8);
        System.out.println("method overloaded for subtraction in child class Multiplication with same name and less no. of argument :" + result9);
        System.out.println("method overloaded for multiplication in child class Average with same name and less no. of argument :" + result10);
        System.out.println("method override for division in child class Average with same name and less no. of argument :" + result11);
        System.out.println("method override for stradd in child class Average with same name and same no. of argument :" + result12);


    }
}

