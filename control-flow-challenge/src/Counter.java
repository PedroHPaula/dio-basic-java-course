import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter:");
        int firstParameter = terminal.nextInt();
        System.out.println("Enter the second parameter:");
        int secondParameter = terminal.nextInt();
        terminal.close();

        try {
            count(firstParameter, secondParameter);
        } catch (InvalidParametersException exception) {
            System.out.println("The second parameter should be greater than the first parameter");
        }
    }

    static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        if (firstParameter > secondParameter) {
            throw new InvalidParametersException();
        }

        int counter = secondParameter - firstParameter;

        for (int i = 0; i < counter; i++) {
            System.out.println("Printing number "+(i+1));
        }
    }
}
