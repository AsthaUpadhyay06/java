import java.util.ArrayList;
import java.util.Iterator;

public class iteratorrsexample {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Astha");
         names.add("Aanaya");
          names.add("Aarya");
           names.add("Vanshika");
            names.add("Harshita");
            Iterator<String>it=names.iterator();
            while(it.hasNext()){
                String elem=it.next();
                System.out.println(elem);
                if(elem.startsWith("A")){
                it.remove(); 
                }
            }


            System.out.println(names);

    }
}
