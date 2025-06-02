import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist6 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(236);
        list.add(253);
        list.add(245);
              // for(int i=list.size()-1;i>=0;i--){
        Collections.reverse(list);
        System.out.println(list);
       }

    }
//}
