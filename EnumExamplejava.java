enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumExamplejava {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        switch (today) {
            case MONDAY: System.out.println("Start of the week!"); break;
            case FRIDAY: System.out.println("Weekend is near!"); break;
            case SUNDAY: System.out.println("Rest day!"); break;
            default: System.out.println("Midweek hustle!");
        }
    }
} 