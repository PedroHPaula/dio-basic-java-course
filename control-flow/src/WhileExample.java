import java.util.concurrent.ThreadLocalRandom;

public class WhileExample {
    public static void main(String[] args) {
        double money = 50.0;

        while (money > 0.0) {
            Double sweetValue = randomValue();

            if (sweetValue > money) {
                sweetValue = money;
            }

            System.out.println("Value of the sweet: "+sweetValue+" Added to the cart");
            money = money - sweetValue;
        }

        System.out.println("Money: "+money);
        System.out.println("All the money is gone...");
    }

    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(5, 15);
    }
}
