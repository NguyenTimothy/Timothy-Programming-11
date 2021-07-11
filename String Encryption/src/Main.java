import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    String name;
    Scanner scan = new Scanner(System.in);
    name = scan.next();
        System.out.println(name.substring(name.length()-1) + name.substring(0, name.length()-1) + "ay\nOriginal: " + name);
    }
}
