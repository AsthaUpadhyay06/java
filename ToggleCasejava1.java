 public class ToggleCasejava1 {
    public static void main(String[] args) {
        String str = "AsThA123";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);
        }
        System.out.println("Toggled: " + sb.toString());
    }
} 