public class maxm {

    public void maximum(int n){
        int a=12;
        int b=23;
        int c=34;
        if(n<a){
            System.out.println("a is great");
        }
        else if(n<b){
            System.out.println("b is grt");
        }
        else{
            System.out.println("c is grt");
        }
    }
    public static void main(String[] args) {
      maxm obj=new maxm();
      obj.maximum(35);
    }
}
