 public class NumberToWords {
    static final String[] units = {
        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int n = 47;
        if (n < 20)
            System.out.println(units[n]);
        else
            System.out.println(tens[n / 10] + (n % 10 != 0 ? " " + units[n % 10] : ""));
    }
} 