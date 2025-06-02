import java.util.HashSet;

public class hashset4 {
    public static void main(String[] args) {
        
        String str="programming";
        HashSet<Character>Set=new HashSet<>();
        for(char ch: str.toCharArray()){
            Set.add(ch);
        }
            System.out.println(Set);
            System.out.println(Set.size());
        
    }
}
