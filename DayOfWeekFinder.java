import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekFinder {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 8, 6);  // change to any date
        DayOfWeek day = date.getDayOfWeek();
        System.out.println("Day: " + day.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}