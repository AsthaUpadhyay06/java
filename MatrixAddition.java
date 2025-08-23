import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2, cols = 2;
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter first matrix:");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                mat1[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                mat2[i][j] = sc.nextInt();

        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                sum[i][j] = mat1[i][j] + mat2[i][j];

        System.out.println("Sum of matrices:");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
    }
}