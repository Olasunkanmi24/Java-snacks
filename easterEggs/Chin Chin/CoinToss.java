import java.util.Random;
import java.util.Scanner;
public class CoinToss{

    public static void main (String [] args){
    
        Random random = new Random();

        Scanner input = new Scanner(System.in);

        int number = random.nextInt(2);

        System.out.println("Guess the outcome of the coin: (0 - Tail, 1 - Head): ");
        int guessedNumber = input.nextInt();

        if (number == guessedNumber){
            System.out.println("You guessed right!");
        }
        if (number != guessedNumber){
            System.out.println("You guessed wrong!");
        }

    }

}
