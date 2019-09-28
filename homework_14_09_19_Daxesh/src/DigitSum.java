import com.sun.deploy.security.SelectableSecurityManager;

/*
11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative

NOTE: The method getEvenDigitSum should be defined as public static
 */
public class DigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);

    }

    public static void getEvenDigitSum(int number) {

        int rem = 0;
        int sum = 0;
        int realRem = 0;
        int temp = number;
        if (temp >= 0) {
            while (temp > 0) {
                rem = temp % 10;
                temp = temp / 10;
                realRem = rem%2;
                if (realRem == 0) {
                    sum = sum + rem;
                }

            }System.out.println("sum of the even digit from " + number + " is = " + sum);
        } else {
            System.out.println("-1 as Given " + number + " is negative ");
        }

    }
}