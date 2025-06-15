import java.util.*;
public class str1 {
    public static void main(String[] args) {
        String str="abce";
        StringBuilder sc=new StringBuilder(str);
        sc.reverse();
        System.out.println(str);
        System.out.println(sc);
        if(str.equals(sc)){
            System.out.println("palindrone");
        }
        else{
            System.out.println("not palindrone");
        }


    }
}
