public class patternwhile9 {


 public static void main(String[] args) {
        int i=1;
        int n=5;
      
        while(i<=n){
            int j=i;
           
            while(j<2*i){
                System.out.print( j + " ");
                j++;


            }
            System.out.println();
            i++;
        }
    } }