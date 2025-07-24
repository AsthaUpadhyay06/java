 public class VowelWords {
    public static void main(String[] args) {
        String str = "Astha is an awesome developer";
        int count = 0;
        for (String word : str.split(" ")) {
            char ch = Character.toLowerCase(word.charAt(0));
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        System.out.println("Words starting with vowel: " + count);
    }
} 