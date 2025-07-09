public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over a lazy dog".toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean b : alphabet) {
            if (!b) isPangram = false;
        }

        System.out.println(isPangram ? "Pangram" : "Not Pangram");
    }
} 
