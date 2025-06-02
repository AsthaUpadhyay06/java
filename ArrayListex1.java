import java.util .ArrayList;

import java.util.Collections;
public class ArrayListex1 {
public static void main(String[] args) {
    
    Integer [] arr={ 10,20,30,40,50};
    ArrayList<Integer>list=new ArrayList<>();
    int size=list.size();
    i
    while(i<j){
        int temp=list.get(i);
        list.set(i,size-i-1);
        list.set(size-i-1,temp);


    }
    System.out.println(list);
   
}
}

