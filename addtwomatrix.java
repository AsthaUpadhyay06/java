import java.util.Scanner;

public class addtwomatrix {
    public static void main(String[] args) {
        int [][]arr1={{1,2,3,4},{1,2,3,4}};
        int[][]arr2={{1,2,3,4},{1,2,3,4}};
        
        int [][]ans=new int[2][4];
          for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2[0].length;j++){
           ans[i][j]=arr1[i][j]+arr2[i][j];   
    }
}
 for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2[0].length;j++){
           System.out.print(ans[i][j]+ " ");
    }
    System.out.println();
}



    }
}
