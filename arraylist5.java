import java.util.ArrayList;
import java.util.Collections;

public class arraylist5 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(24);
        list.add(45);
        list.add(55);
        list.add(466);
        list.add(223);
       
        int max=list.get(0);
        int min=list.get(0);
        int sum=0;
        for(int num:list){
            sum+=num;
            if(num>max){
            max=num;
            if(num<min){
                min=num;

            }
        }
    }
            System.out.println("maximum is "+ max);
                        System.out.println("manimumis "+ min);
                                    int average=sum/list.size();
                                    System.out.println(average);
            }

        }

          
    

