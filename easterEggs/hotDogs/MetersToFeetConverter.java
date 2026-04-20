import java.util.Scanner;

public class MetersToFeetConverter{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter length in meters: ");
        double meters = input.nextDouble();

        double feet = 3.2786 * meters;
        System.out.printf("%.2f meters is equal to %.2f feets%n", meters, feet);
                      
    }

}




