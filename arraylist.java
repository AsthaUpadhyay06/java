import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("A");
        arr.add("b");
        
       //arr .add(1,"jay");
      // arr.add("modii");
      // arr.set(2, "bjp");
      // arr.remove(3);  
      // arr.clear();
      Collections.sort(arr);
       System.out.println(arr);
       arr.remove(3);  
    }
}
