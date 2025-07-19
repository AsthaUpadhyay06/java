public class ReverseVowels {
    public static void main(String[] args) {
        String s = "AsthaUpadhyay";
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (i < j) {
            if (!vowels.contains(arr[i]+"")) i++;
            else if (!vowels.contains(arr[j]+"")) j--;
            else {
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        System.out.println("After vowel reversal: " + new String(arr));
    }
} 