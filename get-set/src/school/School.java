package school;

public class School {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Jeff");
        student.setAge(11);

        System.out.println("The student "+student.getName()+" has "+student.getAge()+" years");
    }
}
