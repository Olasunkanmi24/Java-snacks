import java.util.Scanner;

public class Hexagon{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of a hexagon: ");

        double side = input.nextDouble();

        double area = (3 * Math.sqrt(3)/2) * side * side;

        

            System.out.printf("area of a hexagon is %.2f%n", area); 
              
    }

}




