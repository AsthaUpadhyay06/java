public class printdiagonalsum {
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{5,6,7},{8,9,0}};
        int first=0;
        int second=0;
        for(int i=0;i<arr.length;i++){
            first=first+arr[i][i];
        // System.out.println("First "+ first);
    
                    second=second+arr[i][arr.length-1-i];
                   

                }
                System.out.println("first diagonal sum is  " + first);
                System.out.println("second diagonal sum is "+ second);
            }

        }
        