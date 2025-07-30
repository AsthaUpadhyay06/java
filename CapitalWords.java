public class CapitalWords {
    public static void main(String[] args) {
        String str = "Hello This is Java Code";
        int count = 0;
        for (String word : str.split(" "))
            if (Character.isUpperCase(word.charAt(0))) count++;

        System.out.println("Words starting with capital: " + count);
    }
}