// Abstract class Animal
abstract class Animal {
    // Abstract method sound()
    abstract void sound();
}

// Dog class extending Animal
class Dog extends Animal {
    Override
    void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    Override
    void sound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Main class to test the implementation
public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}