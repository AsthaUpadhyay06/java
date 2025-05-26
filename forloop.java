public class forloop {
    public static void main(String[] args) {
        for(int i=0;i<=15;i+=2){
            System.out.println(i);
            if(( 0&1) ==0){
                continue;
            }
            i++;
        }
    }
}
