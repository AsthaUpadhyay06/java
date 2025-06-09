import java.util.List;
import java.util.stream.Collectors;

public class stringapi6 {
   
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        
        int odd = numbers.stream()
                                          . filter(n -> n % 2 == 1)  // Filter even numbers
                                           .reduce(0,Integitger::sum ) ;         // Square them
                                           //.collect(Collectors.toList()); // Collect into a list
        
        System.out.println(odd);
    }
}
