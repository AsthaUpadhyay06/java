public class UglyNumberjava {
    public static void main(String[] args) {
        int n = 10, count = 0, i = 1;
        while (count < n) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
                count++;
            i++;
        }
        System.out.println(n + "th Ugly Number: " + (i - 1));
    }
} 