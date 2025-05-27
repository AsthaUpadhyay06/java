import java.util.LinkedList;

import javax.naming.LinkLoopException;

public class Day27 {
    public static void main(String[] args) {
        LinkedList<Integer> arr=new LinkedList<>();
        arr.add(4);
        System.out.println(arr.contains(4)); // output true
        System.out.println(arr.contains(5));// output false
    }
}

