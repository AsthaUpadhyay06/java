 public class TechNumber {
    public static void main(String[] args) {
        int num = 2025;
        String s = String.valueOf(num);
        if (s.length() % 2 == 0) {
            int first = Integer.parseInt(s.substring(0, s.length() / 2));
            int second = Integer.parseInt(s.substring(s.length() / 2));
            int sum = first + second;
            if (sum * sum == num)
                System.out.println(num + " is a Tech Number");
            else
                System.out.println(num + " is Not a Tech Number");
        } else {
            System.out.println("Not a Tech Number (odd digits)");
        }
    }
} 