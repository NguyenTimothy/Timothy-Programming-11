import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        String option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to encrypt or decrypt? 'e' for encrypt and 'd' for decrypt.");
        option = scan.next();
        if (!option.equals("e") && !option.equals("d")) {
            System.out.println("Invalid entry. Please try again");
        } else if (option.equals("e")) {
            System.out.println("Please enter the string you would like to encrypt:");
            name = scan.next();
            System.out.println(name.substring(name.length() - 1) + name.substring(0, name.length() - 1) +
                    "ay\nOriginal: " + name);
        } else {
            System.out.println("Please enter the string you would like decrypt:");
            name = scan.next();
            if (name.endsWith("ay")){
                System.out.println(name.substring(1, (name.length() - 2)) + name.charAt(0) + "\nOriginal: " + name);
            } else {
                System.out.println("Invalid entry. Please try again.");
            }
        }
    }
}
