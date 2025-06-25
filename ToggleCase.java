 public class ToggleCase {
    public static void main(String[] args) {
        String str = "JavaRocks";
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()) {
            if(Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));
            else
                result.append(Character.toUpperCase(ch));
        }

        System.out.println(result);
    }
} 