public class CashMachine {
    public static void main(String[] args) throws Exception {
        double balance = 25.0;
        double requestedValue = 22.0;

        if(requestedValue < balance) {
            balance = balance - requestedValue;
            System.out.println("New balance: "+balance);
        }
        else
            System.out.println("Your balance is not enough");
    }
}
