 public class AlphabetCheckjava {
    public static void main(String[] args) {
        char ch = '#';
        System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? "Alphabet" : "Not Alphabet");
    }
} 