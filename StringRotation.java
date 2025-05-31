 public class StringRotation {
    public static boolean areRotations(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1 + s1).contains(s2));
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println("Are Rotations? " + areRotations(s1, s2));
    }
} 
