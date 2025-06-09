import java.util.List;
import java.util.stream.Collectors;



    // . Given a list of names, return a list of names in uppercase which have more than 3 characters.
    

public class  stringapi5{
    public static void main(String[] args) {
        List<String> numbers = List.of("Ram " ,"Shyam,Om,Sita");
        
        List<String> sList= numbers.stream()
                                           .filter(n->n>3);  // Filter even numbers
                                           .map(n -> n * n) ;         // Square them
                                           .collect(Collectors.toList()); // Collect into a list
        
        System.out.println(sList);
    }
}

