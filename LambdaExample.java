import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Anita", "Kiran", "Pooja");

        System.out.println("Names in Uppercase:");
        names.forEach(name -> System.out.println(name.toUpperCase()));
    }
}