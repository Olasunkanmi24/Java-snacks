import java.util.Scanner;

public class GratuityCalculation{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter subtotal: ");

        double subtotal = input.nextDouble();

        double gratuity = 0.12 * subtotal;

        double total = subtotal + gratuity;

            System.out.printf("gratuity is %.2f while total is %.2f%n", gratuity, total); 
              
    }

}




