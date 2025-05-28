import java.util.HashSet;
import java.util.TreeSet;

public class hashset2 {
    public static void main(String[] args) {
        int[] arr={3,21,34,4,4,56,667};
       // HashSet<Integer>set=new HashSet<>();
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:arr){
            set.add(i);
        }
         System.out.println(set);
}
    
}
