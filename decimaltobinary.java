public class decimaltobinary {
    public static void main(String[] args) {
        int i=0;
        int n=5;
        int ans=0;
       
        while (n!=0) {
            int bits=n&1;
           ans = ans + (bits * (int) Math.pow(10, i));
           n=n>>1;
             i++;


            
        }
        System.out.println(ans);
    }
}
