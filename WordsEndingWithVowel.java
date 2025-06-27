public class WordsEndingWithVowel {
    public static void main(String[] args) {
        String str = "Astha is amazing and lovely";
        String[] words = str.split(" ");
        int count = 0;

        for(String word : words) {
            char last = word.charAt(word.length() - 1);
            if("aeiouAEIOU".indexOf(last) != -1) {
                count++;
            }
        }

        System.out.println("Words ending with vowels: " + count);
    }
} 