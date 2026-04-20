import java.util.Scanner;
public class Cynlinder{

    public static void main (String [] args){
    
        Scanner input = new Scanner (System.in);

        System.out.print("Enter radius of a cynlinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter height of a cynlinder: ");
        
        double height = input.nextDouble();

    
  double area = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);

    System.out.printf("The surface area of a cynlinder is %.2f%n", area);


    double volume = (Math.PI * radius * radius * height);

    System.out.printf("The volume of a cynlinder is %.2f%n", volume);

}


}

