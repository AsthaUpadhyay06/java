class Student {
    String name;
    int age;

    Student(String name) {
        this.name = name;
        this.age = 18; // default
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi");
        Student s2 = new Student("Anita", 22);

        s1.display();
        s2.display();
    }
}