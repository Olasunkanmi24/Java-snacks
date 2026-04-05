import java.util.Scanner;

public class Energy{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water: ");

        double m = input.nextDouble();
         System.out.print("Enter the initial: ");

        double initialTemperature = input.nextDouble();
        
          System.out.print("Enter temperature: ");
         double finalTemperature = input.nextDouble();

            double energy = m *(finalTemperature - initialTemperature) * (4184);

         System.out.printf("energy is %.2f%n", energy);

        

           
              
    }

}




