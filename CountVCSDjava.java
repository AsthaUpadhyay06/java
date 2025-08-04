
public class CountVCSDjava {
    public static void main(String[] args) {
        String str = "Java 8 is cool!";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            } else if (Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace(ch)) spaces++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants + ", Digits: " + digits + ", Spaces: " + spaces);
    }
}