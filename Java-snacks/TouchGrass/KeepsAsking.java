import java.util.Scanner;
    
     public class KeepsAsking{
        public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
            double average = 0;
            double count = 0;
            double total = 0;
            
            while(count != -1){
            
                System.out.print("Enter user negative  number: ");
                double number = input.nextDouble();
                
                if(number < 0) {
                
                    break;
                
              }
              
              total = total + number;
              
              count = count + 1;
              
              }
           
                if(count > 0){
                
                average = total / count;
                
                    System.out.printf("average is %.2f", average);
                }  
                
                else {
                
                    System.out.println("do not entered positive number");
                }  
                }
                }
   
