public class exception2 {
    public static void main(String[] args) {
        
    int [] arr={1,2,3,4};
    try {
        System.out.println(arr[6]);
    } catch (Exception e) {
        // TODO: handle exception
       // System.out.println("can't find output because of error");

       // you can print any one of it...

       System.out.println(e);
    }
    System.out.println("hello");
    }

}
