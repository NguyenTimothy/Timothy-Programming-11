import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        String option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to encrypt or decrypt? 'e' for encrypt and 'd' for decrypt.");
        option = scan.next();
        if (option.equals("e")) {
            System.out.println("Please enter the string you would like to encrypt:");
            str = scan.next();
            // Moves the last letter to the front and adds 'ay' to the end
            System.out.println(str.substring(str.length() - 1) + str.substring(0, str.length() - 1) +
                    "ay\nOriginal: " + str);
        } else if (option.equals("d")) {
            System.out.println("Please enter the string you would like decrypt:");
            str = scan.next();
            if (str.endsWith("ay")){
                // Moves the first letter back the end and removes the 'ay'
                System.out.println(str.substring(1, (str.length() - 2)) + str.charAt(0) + "\nOriginal: " + str);
            } else {
                // If the string doesn't end in 'ay' then it can't be decrypted by this program
                System.out.println("Cannot decrypt. Please try again.");
            }
        } else {
            // If the original option for encryption or decryption was neither 'e' nor 'd'
            System.out.println("Invalid entry. Please try again.");
        }
    }
}
