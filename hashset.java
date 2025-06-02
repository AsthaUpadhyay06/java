import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int [] arr={ 12,34,12,34,5,3,3};
        HashSet<Integer> Set=new HashSet<>();
        for(int num: arr){  /// automativally remove kr deta hai duplicate
           Set.add(num);
           
        }
        System.out.println(Set);


    }
}
