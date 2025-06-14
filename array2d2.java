import java.util.Scanner;

public class array2d2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
   
    int[][] myNumbers = new int[3][4];
     System.out.println("value of x ");
   int x=sc.nextInt();
    System.out.println("array values ");
   for(int i=0;i<myNumbers.length;i++){
    for(int j=0;j<myNumbers[i].length;j++){
        myNumbers[i][j] =sc.nextInt();
    } 
}
     System.out.println("compare");
    for(int i=0;i<myNumbers.length;i++){
    for(int  j=0;j<myNumbers[i].length;j++){
        
        if(myNumbers[i][j]==x){
            System.out.println("X find at location " + i  + " ," + j);
            break;
        }
        
    }
    //System.out.println();
   } 


  



    }
}
