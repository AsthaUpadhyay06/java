 public class patternwhile4{
    public static void main(String[] args) {
        int i=1;
        int n=4;
        while(i<=n){
            int j=1;
            while(j<=n){
             System.out.print(n-j+1);
             j=j+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
 