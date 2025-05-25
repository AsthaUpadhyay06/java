public class patternswhile2 {
    public static void main(String[] args) {
        int i=1;
        int n=3;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(i);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
