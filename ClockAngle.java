public class ClockAngle {
    public static void main(String[] args) {
        int hour = 3, minute = 30;

        float hourAngle = (hour % 12) * 30 + (minute * 0.5f);
        float minuteAngle = minute * 6;
        float angle = Math.abs(hourAngle - minuteAngle);

        angle = Math.min(angle, 360 - angle); // smallest angle
        System.out.println("Angle: " + angle + "°");
    }
}