import java.util.*;

public class GuessGamejava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 50 + 1);
        int guess;

        do {
            System.out.print("Guess a number (1-50): ");
            guess = sc.nextInt();
            if (guess > number) System.out.println("Too high!");
            else if (guess < number) System.out.println("Too low!");
            else System.out.println("Correct!");
        } while (guess != number);
    }
}