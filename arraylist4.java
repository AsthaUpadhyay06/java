import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arraylist4 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("delhi");
         list.add("agra");
         list.add("mumbai");
          list.add("jbp");
Collections.sort(list);
System.out.println(list);
    
      if(list.contains("delhi")){
        System.out.println("delhi found");
      }
    }
}
