 import java.util.*;

public class StreamExamplejava {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);

        int sum = numbers.stream()
                         .filter(n -> n % 2 == 0)  // even numbers
                         .mapToInt(Integer::intValue)
                         .sum();

        System.out.println("Sum of even numbers: " + sum);
    }
} 