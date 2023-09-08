public class Person {
    private String name;
    private String identifier;
    private String address;

    //Constructors of the Class
    public Person (String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public Person (String name) {
        super();
        this.name = name;
    }

    public Person () {
        super();
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
