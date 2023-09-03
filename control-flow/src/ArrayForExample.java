public class ArrayForExample {
    public static void main(String[] args) {
        String students[] = {"John","Mary","Thomas","Larry"};

        System.out.println("1st method:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("students["+i+"] = "+students[i]);
        }

        System.out.println("2nd method:");
        for (String student : students) {
            System.out.println("Name of the student: "+student);
        }
    }
}
