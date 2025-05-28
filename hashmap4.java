import java.util.HashMap;

public class hashmap4 {
    public static void main(String[] args) {
       
        String str="  Java is programming and programming is Java ";
         
            String[] newstr=str.split(" ");
            
        HashMap<String, Integer> map = new HashMap<>();

        for (String ch : newstr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println( map );

        }
    }

