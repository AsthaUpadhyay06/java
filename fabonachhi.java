public class fabonachhi {
    public static void main(String[] args) {
        int a=0;int b=1;
        int n=10;
        System.out.print(a + "  " + b + " ");
        for(int i=0;i<=n;i++){
            int sum=a+b;
            System.out.print(sum + " ");
            a=b;
            b=sum;

        }
    }
}
