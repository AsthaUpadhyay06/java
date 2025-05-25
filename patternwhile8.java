public class patternwhile8 {
    public static void main(String[] args) {
        int i=1;
        int n=4;
        int count=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(count + " ");
                count++;
                j++;


            }
            System.out.println();
            i++;
        }
    }
}
