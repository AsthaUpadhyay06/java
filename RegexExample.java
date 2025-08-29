 import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Email me at test@example.com";
        String pattern = "\\w+@\\w+\\.\\w+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.find()) {
            System.out.println("Found Email: " + m.group());
        } else {
            System.out.println("No email found!");
        }
    }
} 