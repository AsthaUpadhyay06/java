public class patternwhile6 {
    public static void main(String[] args) {
        int i=1;
        int n =3;     //i =row
                       // j=column
        while(i<=n){
       int j=1;
       while(j<=i){
        System.out.print("*");
        j=j+1;

}
System.out.println();
i=i+1;
        }
    }
}
