import java.util.Scanner;

    public class Integer{

        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter 5-digit number");
        int number = input.nextInt();

        int firstDigit = number / 10000;

        int lastDigit = number % 10;


        int sum = firstDigit + lastDigit;

            System.out.printf("sum is %d + %d", sum);

}



}

