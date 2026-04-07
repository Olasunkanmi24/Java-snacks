import java.util.Scanner;

       public class PinValidation{

            public static void main(String[] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter 4-digit: ");

        int pin = input.nextInt();

        if (pin >= 1000 && pin <= 9999){
            
            System.out.printf("Valid pin");
        } else {
            System.out.print("invalid pin");
        }

}

}
