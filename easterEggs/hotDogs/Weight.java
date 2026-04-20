import java.util.Scanner;

    public class Weight{

        public static void main(String[] args){

    Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds");
        
    double weight = input.nextDouble();

        System.out.print("Enter height in inches");

    double height = input.nextDouble();

        double kilogram = 0.45359237 * weight;


        double meter = 0.0254 * height;

    double BMI = kilogram / (meter * meter);

            System.out.printf("BMI is %.2f", BMI);




            

}

}
