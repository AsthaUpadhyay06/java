
class Person {
    private String name; // Private variable

    // Constructor
    // public Person(String name) {
    //     this.name = name;
    // }

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulate2
{
    public static void main(String[] args) {
        Person person = new Person();

        //System.out.println("Name: " + person.setName("Astha")); // Accessing name via getter
        //person.setName(astha);

        person.setName("Rahul"); // Modifying name via setter
        System.out.println("Updated Name: " + person.getName());
    }
}
