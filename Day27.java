// import java.util.LinkedList;

// import javax.naming.LinkLoopException;

// public class Day27 {
//     public static void main(String[] args) {
//         LinkedList<Integer> arr=new LinkedList<>();
//         for(int i=0;i<1000;i++){
//             arr.add(i);

            
//         }
//         //arr.add(4);
//         System.out.println(arr);
//         // System.out.println(arr.contains(4)); // output true
//         // System.out.println(arr.contains(5));// output false
//     }
// }

 import java.util.HashSet;
// java.util.LinkedList;
//
//import javax.naming.LinkLoopException;

public class Day27 {
    public static void main(String[] args) {
       // HashSet<Integer>set=new HashSet();
       int [] arr={1,2,3,4,5,5,6,7};
       HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);

        }
        // set.add(5);
        // set.add(5);
        // set.add(6);
       System.out.println(set);

            
        }
        //arr.add(4);
       // System.out.println(arr);
        // System.out.println(arr.contains(4)); // output true
        // System.out.println(arr.contains(5));// output false
    }


