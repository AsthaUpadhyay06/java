import java.util.ArrayList;
import java.util.stream .*;

public class stringapi { 
    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(4); 
        list.add(23); 
        list.add(43); 
        list.add(454); 

        // Correcting the filtering and collecting into an ArrayList
        ArrayList<Integer> data =(ArrayList<Integer>) list.stream().
                                      filter(a -> a > 2). // Keep numbers greater than 2
                                      collect(Collectors.toList()); // Convert back to ArrayList

        System.out.println(data); // Output: [4, 23, 43, 454]
    } 
}