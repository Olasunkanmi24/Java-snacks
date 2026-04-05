import java.util.Scanner;

public class VolumeOfEquilateralTriangle{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lenght of an equilateral: ");
        double lenght = input.nextDouble();

        double volume =  (Math.sqrt(3)/4) * lenght * lenght * lenght;
        
        System.out.printf("The volume of the triangular prism is %.2f%n", volume);
                      
    }

}




