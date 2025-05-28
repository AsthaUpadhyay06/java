import java.util.HashMap;

public class hashmap3 {
    public static void main(String[] args) {
         String str="  java is programming and programming is java ";
         
            String[] newstr=str.split("");
            
        HashMap<String, Integer> map = new HashMap<>();

        for (String ch : newstr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}
