public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over a lazy dog".toLowerCase();
        boolean[] seen = new boolean[26];

        for (char c : str.toCharArray())
            if (c >= 'a' && c <= 'z') seen[c - 'a'] = true;

        boolean isPangram = true;
        for (boolean b : seen) if (!b) isPangram = false;

        System.out.println(isPangram ? "Pangram" : "Not");
    }
}