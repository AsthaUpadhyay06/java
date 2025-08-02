public class AutomorphicCheck {
    public static void main(String[] args) {
        int n = 76;
        int sq = n * n;
        String s1 = String.valueOf(n);
        String s2 = String.valueOf(sq);
        System.out.println(s2.endsWith(s1) ? "Automorphic" : "Not Automorphic");
    }
} 