
    
    class Student {
    // Private variables
    private String name;
    private int marks;

    // Constructor to initialize values
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to set the marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to get the marks
    public int getMarks() {
        return marks;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

// Example usage
public class student1{
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student("Alice", 85);

        // Printing details
        student.printDetails();

        // Modifying values
        student.setName("Bob");
        student.setMarks(90);

        // Printing updated details
        student.printDetails();
    }
}

