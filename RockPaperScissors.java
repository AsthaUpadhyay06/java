 import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice (Rock, Paper, Scissors): ");
        String user = sc.next();
        String computer = choices[rand.nextInt(3)];

        System.out.println("Computer chose: " + computer);

        if(user.equalsIgnoreCase(computer)) System.out.println("Draw!");
        else if(user.equalsIgnoreCase("Rock") && computer.equals("Scissors") ||
                user.equalsIgnoreCase("Paper") && computer.equals("Rock") ||
                user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))
            System.out.println("You win!");
        else System.out.println("Computer wins!");
    }
} 