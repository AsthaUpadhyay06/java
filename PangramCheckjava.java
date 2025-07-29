public class PangramCheckjava {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over a lazy dog".toLowerCase();
        boolean[] seen = new boolean[26];
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) seen[c - 'a'] = true;
        }
        for (boolean b : seen) {
            if (!b) {
                System.out.println("Not Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}