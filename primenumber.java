public class primenumber {
    public static void main(String[] args) {
        int n=14;
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                //System.out.println("prime");
                isPrime=false;
                break;
            }
        }
            if(isPrime){
                System.out.println(" prime number");
            }
            else{
                System.out.println(" not  a prime number");
            }
            }
        }
    

