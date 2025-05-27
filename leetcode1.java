public class leetcode1 {
    public static void main(String[] args) {
        int i=0;
        int n=123;
        int sum=0;
        int ans=0;
        while(n!=0){
            int digit=n%10;
            ans=digit+(ans*10);
            n=n/10;
        }
        System.out.println(ans);
    }
}
