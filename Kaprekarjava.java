public class Kaprekarjava {
    public static void main(String[] args) {
        int low = 1, high = 1000;
        for (int i = low; i <= high; i++) {
            int sq = i * i;
            String str = String.valueOf(sq);
            int len = str.length();
            String left = str.substring(0, len / 2);
            String right = str.substring(len / 2);
            int l = (left.isEmpty()) ? 0 : Integer.parseInt(left);
            int r = (right.isEmpty()) ? 0 : Integer.parseInt(right);
            if (l + r == i)
                System.out.print(i + " ");
        }
    }
} 