import java.util.Random;
import java.util.*;
public class numberguessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int totalround = 3;
        int score = 0;
        System.out.println(" Let's begin the number guessing game");
        for(int round=1; round<=totalround; round++) {
            System.out.println("Round "+ round + " begin");
            int RandomNum = rd.nextInt(100) + 1;
            int totalattempt = 5;
            boolean guesscorrectly = false;
            int attempts = 0;
            while (attempts < totalattempt) {
                System.out.println("Enter your guess (1-100).");
                int guess = sc.nextInt();
                attempts++;
                if (guess == RandomNum) {
                    System.out.println("Your guess is correct");
                    score += totalattempt - attempts + 1;
                    guesscorrectly = true;
                    break;
                }
                else if (guess < RandomNum) {
                    System.out.println("Your guess is too low");
                }
                else {
                    System.out.println("Your guess is too high");
                }
                System.out.println("Attempt left;" + (totalattempt - attempts));
            }
            if (!guesscorrectly) {
                System.out.println("You use all your attempts. The correct num was " + RandomNum);
            }
            System.out.println("\nGame over! your total score " + score);
        }
    }
}
