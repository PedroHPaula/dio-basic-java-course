import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) throws Exception {
        String agency;
        int number;
        String clientName;
        double balance;
        String message;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        scanner.useDelimiter("\n");

        System.out.println("Please, enter the number of your Agency:");
        agency = scanner.next();

        System.out.println("Please, enter the number of your Account:");
        number = Integer.parseInt(scanner.next());

        System.out.println("Please, enter your Full Name:");
        clientName = scanner.next();

        System.out.println("Please, enter your Balance:");
        balance = Double.parseDouble(scanner.next());

        scanner.close();

        message = "Hello "+clientName+", thank you for creating a bank account with us, your agency is ";
        message = message+agency+", account "+number+" and your balance of "+balance+" is already available for withdraw.";

        System.out.println(message);

    }
}
