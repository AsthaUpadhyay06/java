import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringapi7 {
    public static void main(String[] args) {
         List<String> words = Arrays.asList("aryau", "cutie", "cat", "astha");
         List<Integer> lengths = words.stream()
         .map(String::length)
         .collect(Collectors.toList()); // Result ko list me convert karna
         System.out.println(lengths);






    }
}
