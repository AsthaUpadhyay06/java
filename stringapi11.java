import java.util.ArrayList;

public class stringapi11 {
    public static void main(String[] args) {
        
    
     ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        
        list.add(3);
        
        list.add(4);
        int num=list.stream().
        reduce(1, (a, b) -> a * b);
        System.out.println(num);
        


        
}
}
