import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMeScan {
    public static void main(String[] args) {
        
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            scanner.useDelimiter("\n");

            System.out.println("Enter your first name:");
            String firstName = scanner.next();

            System.out.println("Enter your last name:");
            String lastName = scanner.next();

            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            System.out.println("Enter your height:");
            double height = scanner.nextDouble();

            scanner.close();

            System.out.println("Hi, my name is "+firstName+" "+lastName);
            System.out.println("I have "+age);
            System.out.println("My height is "+height);
        } catch(InputMismatchException e) {
            System.err.println("Age and height should be numeric values");
        }
    }
}
