import java.util.Scanner;

    public class Largest{
        public static void main(String[] args){
        
            Scanner input = new Scanner(System.in);
            
            int largest = 0;
            
            
        
            
            
            for(int count = 1; count <= 10; count++){
            
          System.out.printf("Enter number %d: ", count);
             int number = input.nextInt(); 
                
                if(number > largest){
                
                    largest = number;
                }
                }
                
                
            System.out.printf("largest number is %d%n", largest);
                
            
            
            }
        
        }
        
    
