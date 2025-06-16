import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1; // Generates number between 1 and 100
        System.out.println("Random Number: " + randomNum);
    }
} 