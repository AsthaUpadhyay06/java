public class AutomorphicNumber1 {
    public static void main(String[] args) {
        int num = 76;
        int square = num * num;
        String sNum = String.valueOf(num);
        String sSquare = String.valueOf(square);

        if (sSquare.endsWith(sNum))
            System.out.println(num + " is Automorphic");
        else
            System.out.println(num + " is NOT Automorphic");
    }
}