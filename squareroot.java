public class squareroot {
public static int squarerootproblem(int n){
 
        int s=0;
        int e=n;
        int ans=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            long square=1L*m*m;
            if(square==n){
                return m;
            }
            else if(square<n){
                ans=m;
                s=m+1;
            }
            else{
                e=m-1;
            }
}
return ans;
}
    public static void main(String[] args) {
      int result= squarerootproblem(36);
      System.out.println(result); 
            }
        }
    

