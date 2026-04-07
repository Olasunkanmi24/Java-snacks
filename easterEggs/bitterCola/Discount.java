import java.util.Scanner;

    public class Discount{

        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter price: ");
        Double price = input.nextDouble();

            System.out.print("Enter discount percentage: ");

            double discountPercent = input.nextDouble();

        double discountAmount = (discountPercent / 100) * price;

        double finalPrice = price - discountAmount;

            

        System.out.printf("The final price is %.2f", finalPrice);

        

            
  

            

}



}

