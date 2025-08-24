interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}