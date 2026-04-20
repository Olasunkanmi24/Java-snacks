import java.util.Scanner;
    public class TaskFoutheen{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
             System.out.print("Enter first integer: ");
            int number1 = input.nextInt();
              System.out.print("Enter second integer: ");  
             int number2 = input.nextInt();
               System.out.print("Enter third integer: ");
             int number3 = input.nextInt();

                double average = (number1 + number2 + number3)/3;
    
              System.out.printf("The average of %d, %d, and %d, is %.2f%n", number1, number2, number3, average);


}

}

