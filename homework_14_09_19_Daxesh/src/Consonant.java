import java.util.Scanner;

/*Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
        error message.
        For eg:
        Input an alphabet: p
        Expected Output:
        Input letter is Consonant
         */
public class Consonant {
    public static void main(String[] args) {
        cons();
    }

    public static void cons() {
        Scanner scr = new Scanner(System.in);
        System.out.println("enter a letter : ");
        String letter = scr.next();
        switch (letter.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letter + " is a vowel");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println(letter + " is a consonant");
                break;
            default:
                System.out.println("Invalid value has entered");

        }
    }
}
