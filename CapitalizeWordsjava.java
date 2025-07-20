 public class CapitalizeWordsjava {
    public static void main(String[] args) {
        String s = "java is fun";
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words)
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1)).append(" ");

        System.out.println(sb.toString().trim());
    }
}