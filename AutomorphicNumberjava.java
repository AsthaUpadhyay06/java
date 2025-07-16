public class AutomorphicNumberjava{
    public static void main(String[] args) {
        int n = 76;
        int sq = n * n;
        String numStr = String.valueOf(n);
        String sqStr = String.valueOf(sq);

        System.out.println(sqStr.endsWith(numStr) ? "Automorphic" : "Not Automorphic");
    }
}