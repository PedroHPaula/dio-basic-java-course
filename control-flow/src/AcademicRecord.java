public class AcademicRecord {
    public static void main(String[] args) {
        int score = 6;

        String result = score >= 7 ? "Approved" : score >= 5 ? "Re-take the test" : "Not approved";

        System.out.println(result);
    }
}
