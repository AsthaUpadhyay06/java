import java.util.ArrayList;
import java.util.ListIterator; 
 public class iteratorrsss{
public static void main(String[] args) {
    
       ArrayList<String>names=new ArrayList<>();
        names.add("Astha");
         names.add("Aanaya");
          names.add("Aarya");
           names.add("Vanshika");
            names.add("Harshita");
            ListIterator<String>it=names.listIterator();
            while(it.hasNext()){
                String elem=it.next();
                System.out.println(elem);
            }
               


            System.out.println("pree");
            while (it.hasPrevious()) {
                String lastvalue=it.previous();
                System.out.println(lastvalue);
                
            }
            
        }
    }