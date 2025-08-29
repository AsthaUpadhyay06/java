 import java.util.*;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private String name;
    Subscriber(String name) { this.name = name; }
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Channel {
    private List<Observer> subs = new ArrayList<>();
    void subscribe(Observer o) { subs.add(o); }
    void notifySubs(String message) {
        for (Observer o : subs) o.update(message);
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Subscriber s1 = new Subscriber("Ravi");
        Subscriber s2 = new Subscriber("Anita");

        channel.subscribe(s1);
        channel.subscribe(s2);

        channel.notifySubs("New Video Uploaded!");
    }
} 