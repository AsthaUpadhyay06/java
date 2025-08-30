 public class SimpleCalc {
    public static void main(String[] args) {
        int a = 8, b = 4;
        char op = '*';

        if (op == '+') System.out.println(a + b);
        else if (op == '-') System.out.println(a - b);
        else if (op == '*') System.out.println(a * b);
        else if (op == '/') System.out.println(a / b);
        else System.out.println("Invalid Operation");
    }
} 