import java.util.Scanner;
public class ThreeDigitNumber{

    public static void main (String [] args){
    
        Scanner input = new Scanner (System.in);

        System.out.print("Enter a 3-digit number: ");
        int number = input.nextInt();

       int firstDigit = number % 10;
        int secondDigit = (number/10)%10;
        int thirdDigit = number/100;
        int sumOfDigits =  firstDigit + secondDigit +  thirdDigit;      
        

    System.out.printf("The sum of %d, %d, and %d is %d%n", firstDigit, secondDigit,  thirdDigit, sumOfDigits);



}


}
