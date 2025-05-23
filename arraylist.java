import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("astha");
        arr.add("jiya");
        arr.add("arya");
        arr.add("muje nhi pta tum kon hai");
        
       arr .add(1,"jay");
       arr.add("modii");
       arr.set(2, "bjp");
       arr.remove(3);  
       System.out.println(arr);
       arr.remove(3);  
    }
}
