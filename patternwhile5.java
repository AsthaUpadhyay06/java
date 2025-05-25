public class patternwhile5 {
 public static void main(String[] args) {
    int i=1;
    int n=4;
    int count=1;
    while(i<=n){
        int j=1;
        while(j<=n){
            System.out.print(count + " ");
            count++;
            j=j+1;
        }
        System.out.println();
        i++;
    }
 }   
}
