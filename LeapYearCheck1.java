public class LeapYearCheck1 {
    public static void main(String[] args) {
        int year = 2024;

        boolean isLeap = (year / 4 * 4 == year && year / 100 * 100 != year) || (year / 400 * 400 == year);

        System.out.println(isLeap ? "Leap Year" : "Not Leap Year");
    }
}