 public class CenturyLeapYear {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println("Century Leap Year");
        else
            System.out.println("Not a Century Leap Year");
    }
}