/*13. Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
otherwise, the method should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static
 */
public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12,22);
        hasSharedDigit(9,99);
        hasSharedDigit(15,55);
        hasSharedDigit(15,105);
    }
    public static void hasSharedDigit(int number1, int number2){
        if (number1 <10  || number1 >99  || number2 < 10 || number2 >99){
            System.out.println("false since number is not within the range of 10-99");
        }else {
            int rem1 = number1%10;
            int rem2 = number1/10;
            int rem3 = number2%10;
            int rem4 = number2/10;
            if(rem1 == rem3 || rem1 == rem4){
                System.out.println("true as "+rem1+" is appeared in both "+number1 +" and "+number2);
            }else if(rem2 == rem3 || rem2 == rem4){
                System.out.println("true as "+rem2+" is appeared in both "+number1 +" and "+number2);
            }
        }

    }
}