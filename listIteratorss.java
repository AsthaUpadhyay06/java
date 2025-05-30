 import java.util.ArrayList;
import java.util.ListIterator; 
 public class listIteratorss{
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
               if(elem.length()<=4){
                it.set("byee");
            }
        }
        System.out.println(names);
            int count=0;
            while (it.hasPrevious()) {
                String ele=it.previous();
                count++;


               if(count!=names.size()){
                it.set("hello");
               }
                
            }
            
        }
    } 