import java.util.Scanner;

public class MonthlySaving{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly saving: ");

        double monthlySaving = input.nextDouble();

        double monthlyRate = 0.003125;

        double firstMonth = 1.003125 * monthlySaving;
        
         double secondMonth = 1.003125 * (monthlySaving + firstMonth);

        double thirdMonth = 1.003125 * (monthlySaving + secondMonth); 

        double fouthMonth = 1.003125 * (monthlySaving + thirdMonth);

        double fifthMonth = 1.003125 * (monthlySaving + fouthMonth);

        double sixthMonth = 1.003125 * (monthlySaving + fifthMonth);

        System.out.printf("first Month accout value is %.2f%n", firstMonth);
        
        System.out.printf("second Month accout value is %.2f%n", secondMonth);
           
         System.out.printf("third Month accout value is %.2f%n", thirdMonth); 

        System.out.printf("fouth Month accout value is %.2f%n", fouthMonth); 

        System.out.printf("fifth Month accout value is %.2f%n", fifthMonth);
    
        System.out.printf("sixth Month accout value is %.2f%n", sixthMonth);



}

}











