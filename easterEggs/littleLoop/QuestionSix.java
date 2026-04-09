import java.util.Scanner;
    
    public class QuestionSix{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first digit: ");

            int firstDigit = input.nextInt();

        int number = 1;

        int sum = 0;

        while(number <= firstDigit){
        sum = sum + number;
       
           
        number++;

        System.out.printf("sum is %d%n", sum);

        
            
    

}

}

}
