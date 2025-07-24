 public class Disariumjava {
    public static void main(String[] args) {
        int n = 89, sum = 0, temp = n;
        String numStr = String.valueOf(n);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            sum += Math.pow(digit, i + 1);
        }
        System.out.println(n == sum ? "Disarium" : "Not");
    }
} 