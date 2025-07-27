 public class UniqueCharsjava {
    public static void main(String[] args) {
        String s = "abcdef";
        boolean[] seen = new boolean[256];
        boolean isUnique = true;

        for (char c : s.toCharArray()) {
            if (seen[c]) {
                isUnique = false;
                break;
            }
            seen[c] = true;
        }

        System.out.println(isUnique ? "All Unique" : "Duplicates Found");
    }
} 