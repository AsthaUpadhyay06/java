public class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void display() {   // overriding with annotation
        System.out.println("Child class method");
    }
}

public class AnnotationExample {
    @Deprecated
    static void oldMethod() {
        System.out.println("This method is deprecated");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        oldMethod();
    }
} 