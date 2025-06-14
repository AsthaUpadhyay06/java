import java.util.Scanner;

public class array2D1 {
   
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter arrry elements");
    int[][] myNumbers = new int[3][5];
   //int x=sc.nextInt();
   for(int i=0;i<myNumbers.length;i++){
    for(int j=0;j<myNumbers[i].length;j++){
        myNumbers[i][j] =sc.nextInt();
    } 
}
    System.out.println("print array elements ");
    for(int i=0;i<myNumbers.length;i++){
    for(int  j=0;j<myNumbers[i].length;j++){
        System.out.print(myNumbers[i][j] + " ");
        // if(myNumbers[i][j]==x){
        //     System.out.println("X find at location " + i  + " ," + j);
            // break;
        }
        System.out.println();
   } 
    }
    //System.out.println();
   } 


  


