import java.util.Scanner;

public class OppositeSide{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");

        int firstInteger= input.nextInt();
        
        System.out.print("Enter second integer: ");

        int secondInteger = input.nextInt();

        if (firstInteger >= 0 && secondInteger >= 0){

            int sumOfNumbers = firstInteger + secondInteger;

            System.out.printf("The sum of %d and %d is %d%n", firstInteger, secondInteger, sumOfNumbers);
        }
      
        else if (firstInteger < 0 && secondInteger < 0) {

            int productOfNumber = firstInteger * secondInteger;

            System.out.printf("the product of %d and %d is %d%n", firstInteger, secondInteger, productOfNumber);

        } 
        else {
            if (firstInteger > secondInteger){
                int difference = firstInteger - secondInteger;
                System.out.printf("The difference between %d and %d is %d%n", firstInteger, secondInteger, difference);
            }
            else{
                int difference = secondInteger - firstInteger;
                System.out.printf("The difference between %d and %d is %d%n", firstInteger, secondInteger, difference);
            }

        }          

    }

}
