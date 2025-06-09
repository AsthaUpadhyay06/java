//import java.lang.reflect.Array;
import java.util.ArrayList;

public class strinfapi10 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(14);
        list.add(22);
        list.add(30);
        boolean istrue=list.stream().
        anyMatch(num->num%7==0);
        System.out.println(istrue);

    }
    
}
