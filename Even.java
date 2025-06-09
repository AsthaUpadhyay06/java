

import java.util.List;
import java.util.stream.Collectors;

public class Even {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        
        List<Integer> evenSquares = numbers.stream()
                                           .filter(n -> n % 2 == 0)  // Filter even numbers
                                           .map(n -> n * n)          // Square them
                                           .collect(Collectors.toList()); // Collect into a list
        
        System.out.println(evenSquares);
    }
}
