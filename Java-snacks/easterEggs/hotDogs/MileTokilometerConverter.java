import java.util.Scanner;

    public class MileTokilometerConverter{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

                System.out.print("Enter the number of miles: ");

                    double miles = input.nextDouble();
                        
          double kilometers = 1.6 * miles;
        
                    System.out.printf("%.2f in miles is equal to %.2f%n in kilometers", miles, kilometers);

                        
}


}




