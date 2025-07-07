import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; 
        int guess;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == numberToGuess) {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("📉 Too low. Try again.");
            } else {
                System.out.println("📈 Too high. Try again.");
            }
        }

        scanner.close();
    }
}
