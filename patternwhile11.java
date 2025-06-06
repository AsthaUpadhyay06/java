public class patternwhile11 {
    public static void main(String[] args) {
        int Row=1;
        int n= 4;
        while(Row<=n){
            int col=1;
            while(col<=n){
                char ch= 'A'+ Row-1;
                System.out.print(ch);
                col++;
            }
            System.out.println();
            Row++;
        }
    }
}
