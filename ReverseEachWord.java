public class ReverseEachWord {
    public static void main(String[] args) {
        String sentence = "Hello Java World";
        String[] words = sentence.split(" ");
        
        for(String word : words) {
            String reversed = "";
            for(int i = word.length()-1; i >= 0; i--) {
                reversed += word.charAt(i);
            }
            System.out.print(reversed + " ");
        }
    }
} 