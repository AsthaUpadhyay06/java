 public class UniqueCharsjava2 {
    public static void main(String[] args) {
        String s = "banana";
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c))
                System.out.print(c + " ");
        }
    }
} 