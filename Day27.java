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

//  import java.util.HashSet;
// java.util.LinkedList;
//
//import javax.naming.LinkLoopException;

// public class Day27 {
//     public static void main(String[] args) {
//        // HashSet<Integer>set=new HashSet();
//        int [] arr={1,2,3,4,5,5,6,7};
//        HashSet<String> set=new HashSet<>();
//        set.add("A");
//        set.add("B");
//        set.add("C");
//        set.add("C");
//         // for(int i=0;i<arr.length;i++){
//         //     set.add(arr[i]);

//         // }
//         // set.add(5);
//         // set.add(5);
//         // set.add(6);
//        System.out.println(set);

//         }
//         //arr.add(4);
//        // System.out.println(arr);
//         // System.out.println(arr.contains(4)); // output true
//         // System.out.println(arr.contains(5));// output false
//     }

//  //import java.util.LinkedList;
//  import java.util.HashSet;
// //import javax.naming.LinkLoopException;

// // public class Day27 {
// //     public static void main(String[] args) {
// //         int [] arr={1,2,2,3,4,4,5,6,6,7};
// //        HashSet <Integer> set=new HashSet<>();
// //         for(int i=0;i<arr.length;i++){
// //             for(int j=i+1;j<arr.length;j++){
// //            if(arr[i]==arr[j]){
// //             System.out.println(arr[i]);
// //             break;
// //            }
// //         }
//System.out.println(arr[i]);
// arr.add(i);

//arr.add(4);
//System.out.println(arr);
// System.out.println(arr.contains(4)); // output true
// System.out.println(arr.contains(5));// output false

//pahle jo repeat ho rha vo print karvana hai
import java.util.HashSet;

public class Day27 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6, 7 };
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                System.out.println(arr[i]);
                break;

            }

            set.add(arr[i]);
        }
    }
}
