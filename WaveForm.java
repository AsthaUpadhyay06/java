public class WaveForm {
    public static void main(String[] args) {
        int [][] arr={{3,0,4,2},{7,8,11,5},{9,23,12,1},{1,38,5,9}};
        for(int j=0;j<arr[0].length;j++){
            if(j%2==0){
                for(int i=0;i<arr.length;i++){
                    System.out.print( arr[i][j]+ " ");
                }
            }
                
                else{
                    for(int i=arr.length-1;i>=0;i--){
                        System.out.print(arr[i][j]+ " ");
                    }
                }
            }
        }
    }
    

