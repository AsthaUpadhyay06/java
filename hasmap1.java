import java.util.HashMap;

public class hasmap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("id", 101);
        map.put("astha", 619);
        map.put("astha", 678);
        map.forEach((key,value)->{
            System.out.println(key+ " "+value);
        });
       // System.out.println(map.get("astha"));
    //    System.out.println(map.get("anaya"));
    //    System.out.println(map.getOrDefault("astha", 0));
    //    System.out.println(map.keySet());
    //    System.out.println(map.values());
    //    System.out.println(map);

    }
}
