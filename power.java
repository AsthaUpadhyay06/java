public class power {

    public int calculatepower(int a,int b){
        int ans=1;
        for(int i=1;i<=b;i++){
           ans=ans*a;
        }
        
        return  ans;

    }
    public static void main(String[] args) {
        power obj=new power();
        
    
      int result=  obj.calculatepower(2, 3);
     int answer= obj.calculatepower(2,5);
      
      
        System.out.println(result);
        System.out.println(answer);
    }
}
