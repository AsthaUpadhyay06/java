
import java.util.ArrayList;

public class stringapi9 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(999);
        list.add(1000);
        
        list.add(1500);
        
        list.add(1000);
        list.add(2000);
        int totalSum=list.stream().
        distinct()
             .filter(lists->lists>1000)
             .reduce(0,Integer::sum);
        System.out.println(totalSum);


        
    }
}
    //     int totalSum = prices.stream()
    //                          .distinct() // Duplicate values hataana
    //                          .filter(price -> price > 1000) // Sirf 1000 se zyada wale prices lena
    //                          .reduce(0, Integer::sum); // Reduce ka use karke sum calculate karna

    //     System.out.println("Total sum of filtered prices: " + totalSum);
    // }
