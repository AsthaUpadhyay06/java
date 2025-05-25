public class patternwhile {
    public static void main(String[] args) {
        int i=1;
        int n=3;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("*");
                j=j+1;
            }
            System.out.println();
            i++;
        }
    }
    
}
