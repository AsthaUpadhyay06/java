 import java.time.LocalTime;

public class DigitalClock {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
} 