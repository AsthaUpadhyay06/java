 public class LongestWordjava {
    public static void main(String[] args) {
        String s = "Java makes coding beautiful";
        String[] words = s.split(" ");
        String longest = "";

        for (String word : words)
            if (word.length() > longest.length()) longest = word;

        System.out.println("Longest: " + longest);
    }
} 
