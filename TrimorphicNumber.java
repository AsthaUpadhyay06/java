 public class TrimorphicNumber {
    public static void main(String[] args) {
        int n = 24;
        int cube = n * n * n;
        System.out.println(cube % (int)Math.pow(10, String.valueOf(n).length()) == n 
            ? "Trimorphic Number" : "Not Trimorphic");
    }
} 