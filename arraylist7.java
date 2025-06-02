import java.util.ArrayList;
import java.util.Collections;

public class arraylist7 {
    public static void main(String[] args) {
        //merge + sort
        ArrayList<Integer>list=new ArrayList<>();
       

        list.add(236);
        list.add(253);
        list.add(245);
         ArrayList<Integer>list1=new ArrayList<>();
        list1.add(34);
        list1.add(345);
        list1.add(354);


        list.addAll(list1);// list 1 me list 2 k elements chale gye  lekin list 2 origin hi hai agar print kre too


      Collections.sort(list);
        System.out.println();
        System.out.println(list);
    }
}
