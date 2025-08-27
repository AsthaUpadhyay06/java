import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try {
            // Serialize object
            Student s1 = new Student("Ravi", 21);
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(s1);
            out.close();
            System.out.println("Object Serialized!");

            // Deserialize object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            Student s2 = (Student) in.readObject();
            in.close();

            System.out.println("Deserialized Student: " + s2.name + ", Age: " + s2.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}