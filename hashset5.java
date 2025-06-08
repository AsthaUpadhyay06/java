import java.util.HashSet;
import java.util.Iterator;



public class hashset5 {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(34);
        set.add(34);

        set.add(45);
        set.add(56);
        System.out.println(set.size());
        System.out.println(set);
        if(set.contains(34)){
            System.out.println("find");
        }
        if(!set.contains(46)){
            System.out.println("not find");
        }
      Iterator it=set.iterator();
      while(it.hasNext()){
        System.out.println(it.next());
      }
    }
    
}
