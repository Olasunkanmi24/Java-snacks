import java.util.Scanner;

public class SquareMeter{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();

        double ping = 0.3025 * squareMeters;
        System.out.printf("%.2f square meters is equal to %.2f ping%n", squareMeters, ping);
                      
    }

}




