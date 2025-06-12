public class armstrong {
    public static void main(String[] args) {
        int num=153;
        int sum=0;
        int original=num;
        while(num>0){
            int rem=num%10 ;  
            sum=sum+rem*rem*rem;
             num=num/10;

             }
             if(sum==original){
                System.out.println("armstrong");
             }
             else{
                System.out.println("not a armstrong");
             }
    }
}
