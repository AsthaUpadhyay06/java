 public class decimaltobinary1{
    public static void main(String[] args) {
        int i=0;
        int n=-10;
        int ans=0;
       
//         while (n==0) {
//             int bits=n&1;
//            ans = ans + (bits * (int) Math.pow(10, i));
//            n=n>>1;
//              i++;


            
//         }
//         System.out.println(ans);
//     }
// }
while(n!=0){
int bits=n&1;
           ans = ans + (bits * (int) Math.pow(10, i));
           n=n>>1;
             i++;
}
System.out.println(n);

