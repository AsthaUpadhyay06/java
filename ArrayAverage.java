 public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int sum = 0;
        for (int n : arr) sum += n;
        double avg = (double) sum / arr.length;
        System.out.println("Average = " + avg);
    }
} 
    

