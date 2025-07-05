public class RemoveDuplicates1
 {
    public static void main(String[] args) {
        String str = "aastthhaa";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(String.valueOf(str.charAt(i))) == -1)
                result.append(str.charAt(i));
        }

        System.out.println("Without duplicates: " + result);
    }
}