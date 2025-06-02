import java.util.HashSet;

public class hashset3 {
    public static void main(String[] args) {
         HashSet<Integer> set=new HashSet<>();
        int [] arr={ 12,34,12,34,5,3,3};
        boolean contain=false;
        for(int num:set){ // check krega duplicate hai ya nhi 
            //or duplicate mil gya
        if(set.contains(num)){
            contain=true;
            
        }
        set.add(num);
    }
        if(!contain){ // duplicate value nhi mila
System.out.println("dullicate value  hai");
        }
        else{
            System.out.println("duplicates value  nhi hai");
        }
    }
}
