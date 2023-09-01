import java.util.Locale;
import java.util.Scanner;

public class AboutMeScan {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        scanner.useDelimiter("\n");

        System.out.println("Enter your name:");
        String name = scanner.next();

        System.out.println("Enter your last name:");
        String lastName = scanner.next();

        System.out.println("Enter your age:");
        String age = scanner.next();

        System.out.println("Enter your height:");
        String height = scanner.next();

        scanner.close();

        System.out.println("Hi, my name is "+name+" "+lastName);
        System.out.println("I have "+age);
        System.out.println("My height is "+height);
    }
}
