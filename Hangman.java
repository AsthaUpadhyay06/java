 import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String word = "java";
        char[] guessed = new char[word.length()];
        for(int i=0;i<guessed.length;i++) guessed[i] = '_';
        Scanner sc = new Scanner(System.in);
        int attempts = 5;

        while(attempts > 0) {
            System.out.print("Guess a letter: ");
            char ch = sc.next().charAt(0);
            boolean correct = false;
            for(int i=0;i<word.length();i++) {
                if(word.charAt(i) == ch) {
                    guessed[i] = ch;
                    correct = true;
                }
            }
            if(!correct) attempts--;
            System.out.println("Current word: " + new String(guessed));
            System.out.println("Attempts left: " + attempts);
            if(new String(guessed).equals(word)) {
                System.out.println("You won!");
                break;
            }
        }
        if(!new String(guessed).equals(word)) System.out.println("Game Over! Word was: " + word);
    }
} 