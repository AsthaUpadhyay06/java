class algebra{
    int a;
    int b;
    algebra(int x,int y){
        System.out.println("constructor atomatically called");
        a=x;
        b=y;
    }
    int  add(){
        int ans= a+b;
        return ans;
       
    }
    int  mul(){
        int ans= a*b;
        return ans;
       
    }
    int  divide(){
        int ans= a/b;
        return ans;
       
    }
}



public class constructors {


    public static void main(String[] args) {
        algebra obj=new algebra(3, 5);
       System.out.println(obj.add());
       System.out.println(obj.mul());
       System.out.println(obj.divide());
        
        
    }
}
