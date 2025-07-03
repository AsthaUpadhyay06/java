 public class ToggleCase1 {
    public static void main(String[] args) {
        String str = "HeLLo WoRLd";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }

        System.out.println("Toggled: " + sb);
    }
} 