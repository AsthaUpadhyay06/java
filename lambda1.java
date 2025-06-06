import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class lambda1{
   public static void main(String[] args) {
    ArrayList<String>list=new ArrayList<>();
    list.add("astha");
    list.add("arya");
    list.add("vedhant");
    list.add("rajneesh");
    list.add("jiya");
    list.add("raunak");
    Collections.sort(list,(a,b)-> a.compareTo(b));
    System.out.println(list);
    
   }

}
