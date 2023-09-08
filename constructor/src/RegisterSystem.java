public class RegisterSystem {
    public static void main(String[] args) {
        Person person1 = new Person("123456789", "John");
        Person person2 = new Person("Allan");
        Person person3 = new Person();


        person1.setAddress("Baker's Street");

        System.out.println("\nPerson1's Data:");
        System.out.println("Name: "+person1.getName());
        System.out.println("Identifier: "+person1.getIdentifier());
        System.out.println("Address: "+person1.getAddress());

        System.out.println("\nPerson2's Data:");
        System.out.println("Name: "+person2.getName());
        System.out.println("Identifier: "+person2.getIdentifier());
        System.out.println("Address: "+person2.getAddress());

        System.out.println("\nPerson3's Data:");
        System.out.println("Name: "+person3.getName());
        System.out.println("Identifier: "+person3.getIdentifier());
        System.out.println("Address: "+person3.getAddress());
    }
}
