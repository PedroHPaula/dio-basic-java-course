public class MeasuringSystem {
    public static void main(String[] args) {
        String abbreviation = "X";

        switch (abbreviation) {
            case "S":
                System.out.println("SMALL");
                break;

            case "M":
                System.out.println("MEDIUM");
                break;

            case "B":
                System.out.println("BIG");
                break;
        
            default:
                System.out.println("UNDEFINED");
                break;
        }
    }
}
