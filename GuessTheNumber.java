
    import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int target = rand.nextInt(100) + 1; // Random number from 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("🎮 Welcome to the Guess the Number Game!");
        System.out.println("I have chosen a number between 1 and 100.");
        System.out.println("Can you guess it? 🤔");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too Low! 🔽 Try again.");
            } else if (guess > target) {
                System.out.println("Too High! 🔼 Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed it in " + attempts + " attempts.");
            }

        } while (guess != target);

        sc.close();
    }
}

