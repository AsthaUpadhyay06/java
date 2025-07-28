 public class CharCounter {
    public static void main(String[] args) {
        String s = "Java is Awesome!";
        int v = 0, c = 0, w = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) v++;
            else if (ch >= 'a' && ch <= 'z') c++;
            else if (ch == ' ') w++;
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c + ", Spaces: " + w);
    }
} 