public class CenturyYear {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 100 == 0)
            System.out.println(year + " is a Century Year");
        else
            System.out.println(year + " is Not a Century Year");
    }
}