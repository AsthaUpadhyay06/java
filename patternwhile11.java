public class patternwhile11 {
    public static void main(String[] args) {
        int row=1;
        int n= 4;
        while(row<=n){
            int col=1;
            while(col<=n){
                char ch= 'A'+row-1;
                System.out.print(ch);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
