import java.util.ArrayList;

public class reduce1 {
    public static void main(String[] args) {
           ArrayList<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(45);
        list.add(43);
        list.add(42);
        list.add(43);
        int sum=list.stream().reduce(0,(a,b)-> a>b ? a:b ) ;
        System.out.println(sum);
    }

}
 // condition ? value_if_true : value_if_false;