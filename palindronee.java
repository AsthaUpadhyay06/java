public class palindronee {

    public int fabonacii(int n){

        int a=0;int b=1;
        
      for(int i=1;i<n;i++){
      
        System.out.println(a);
        
         int sum=a+b;
          a=b;

        b=sum;
      }
     return b;
      
    }
    public static void main(String[] args) {
        palindronee obj=new palindronee();
     int result = obj.fabonacii(10); 
     System.out.println(result); 
    }
}
