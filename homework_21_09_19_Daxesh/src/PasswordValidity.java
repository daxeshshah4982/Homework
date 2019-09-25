import java.util.Scanner;

/*14. Write a Java method to check whether a string is a valid password
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.   ///special character range : 32 to 47,58 to 64,91 to 96,123 to 126
A password must contain at least two digits.
Expected Output:
1. A password must have at least eight characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
Password is valid: abcd1234
 */
public class PasswordValidity {
    public static void main(String[] args) {
        pass();
    }

    public static void pass() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String password = scr.nextLine();

        int digit = 0;
        int symbol = 0;
        int letter = 0;
        int i = 0;

        if (password.length() < 10) {
            System.out.println("A password must have at least 10 characters");
            return;
        }

        while (i < password.length()){
            if ((password.charAt(i) >= '0') && (password.charAt(i) <= '9')) {
                digit = digit + 1;
            } else if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') || (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')) {
                letter = letter + 1;
            } else
                symbol += 1;
            i++;
        }
        if ((digit >= 2) && (symbol == 0)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("password is invalid");
        }

    }
}
