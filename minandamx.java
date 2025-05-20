


public class minandamx{
   public static void main(String args[]) {
    int[] numbers={12,34,56,77,55};

int i;

      
     int min=numbers[0];
     int max=numbers[0];


     
     
       for( i=0; i<numbers.length; i++) {
           if(numbers[i] < min) {
               min = numbers[i];
           }
           if(numbers[i] > max) {
               max = numbers[i];
           }
       }


       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min);
      
   }
}
 