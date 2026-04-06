import java.util.Scanner;
public class NumberDivision{

    public static void main (String [] args){
    
        Scanner input = new Scanner (System.in);

        System.out.print("Enter m: ");
        int m = input.nextInt();

        System.out.print("Enter n");
        
        int n = input.nextInt();

        if (n == 0){
            System.out.println("m cannot be divided by 0");
        }
        if (n != 0){
         double answer = (m * 1.0) / n;
            System.out.printf("%d / %d = %.2f%n", m, n, answer);
        }
    }
}

