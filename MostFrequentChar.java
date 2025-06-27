 public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];
        char maxChar = ' ';
        int max = 0;

        for(char ch : str.toCharArray()) {
            freq[ch]++;
            if(freq[ch] > max) {
                max = freq[ch];
                maxChar = ch;
            }
        }

        System.out.println("Most frequent character: " + maxChar + " → " + max);
    }
}