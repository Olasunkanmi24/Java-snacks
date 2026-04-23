//collect mile driven from the user
//collect gallons used for each tankful from the user
//to calculate and display the miles per gallons 
//we should also print the combine miles
//


import java.util.Scanner;
    
    public class GasMileage{
        public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter mile driven: ");
                int mile = input.nextInt();
            
            System.out.print("Enter gallons: ");
                int gallon = input.nextInt();
            
         double result = mile / gallon;
            
            System.out.printf("result is %.2f%n", result);
        }
    }
