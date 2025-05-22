public class exception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        
        try{
            int c=a/b;
        System.out.println(c);
    }
    catch(Exception e){
        System.out.println("we can not devide bt zero");
    }
    System.out.println("hiii");
    System.out.println("hello");
}
}