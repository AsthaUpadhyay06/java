// Define a class with encapsulation
class Person {
    // Private attributes (hidden from direct access)
    private String name;
    private int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to access name
    public String getName() {
        return name;
    }

    // Setter method to modify name
    public void setName(String newName) {
        this.name = newName;
    }

    // Getter method to access age
    public int getAge() {
        return age;
    }

    // Setter method to modify age
    public void setAge(int newAge) {
        if (newAge > 0) {  // Validation to ensure positive age
            this.age = newAge;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

// Main class to demonstrate encapsulation
public class Main {
    public static void main(String[] args) {
        // Create an object of Person
        Person person1 = new Person("Alice", 25);

        // Access values using getter methods
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Modify values using setter methods
        person1.setName("Bob");
        person1.setAge(30);

        // Display modified values
        System.out.println("Updated Name: " + person1.getName());
        System.out.println("Updated Age: " + person1.getAge());
    }
}
