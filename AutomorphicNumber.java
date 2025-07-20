 public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 76;
        int sq = num * num;

        if (String.valueOf(sq).endsWith(String.valueOf(num)))
            System.out.println(num + " is Automorphic");
        else
            System.out.println(num + " is Not Automorphic");
    }
} 