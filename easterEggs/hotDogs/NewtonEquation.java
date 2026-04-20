import java.util.Scanner;

public class NewtonEquation{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial velocity u: ");

        double u = input.nextDouble();
         System.out.print("Enter time span t: ");

        double t = input.nextDouble();
        
          System.out.print("Enter acceleratioin a: ");
         double a = input.nextDouble();

            double distance = (u * t) + (0.5 * a * t * t);

         System.out.printf("Distance is %.2f", distance);

        

           
              
    }

}




