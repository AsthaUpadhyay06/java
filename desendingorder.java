import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class desendingorder {
    public static void main(String[] args) {
       ArrayList<Integer>list=new ArrayList();
       list.add(12);
        list.add(32);
        list.add(34);
       
         list.add(554);
       
          list.add(124);
          System.out.println(list);
    Collections.sort(list,Comparator.reverseOrder());
    System.out.println("sorted list " +list);
       
          

    }
}
