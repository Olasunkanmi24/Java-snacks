import java.util.Random;
public class NumberDifference{

    public static void main (String [] args){
    
        Random random = new Random();

        int firstNumber = random.nextInt(5) + 5;
        int secondNumber = random.nextInt(6);

        int difference = firstNumber - secondNumber;

        System.out.printf("The difference between %d and %d is %d%n", firstNumber, secondNumber, difference);

    }

}
