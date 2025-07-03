public class CountLetters {
    public static void main(String[] args) {
        String str = "AsthaUPADHYAY";
        int capital = 0, small = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) capital++;
            else if (Character.isLowerCase(c)) small++;
        }

        System.out.println("Capital: " + capital + ", Small: " + small);
    }
}