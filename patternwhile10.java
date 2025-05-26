public class patternwhile10{
   public static void main(String[] args) {
    int row=1;
    int n=4;
    while(row<=n){
      int col=1;
      while(col<=row){
         System.out.print(row-col+1);
      col++;
      }
      System.out.println();
    row++;
    }
   }
    
}