public class Automorphic {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;
        String strNum = String.valueOf(num);
        String strSquare = String.valueOf(square);

        if (strSquare.endsWith(strNum))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic");
    }
}