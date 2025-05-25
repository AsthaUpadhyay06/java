public class patternwhile9 {


 public static void main(String[] args) {
        int i=1;
        int n=4;
      
        while(i<=n){
            int j=1;
            int value=i;
            while(j<=i){
                System.out.print( value + " ");
                value++;
                j++;


            }
            System.out.println();
            i++;
        }
    } }