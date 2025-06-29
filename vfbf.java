public class AllSubstrings {
    public static void substrings(String str, int start, int end) {
        if (start == str.length())
            return;
        else if (end > str.length())
            substrings(str, start + 1, start + 1);
        else {
            System.out.println(str.substring(start, end));
            substrings(str, start, end + 1);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        substrings(str, 0, 1);
    }
}