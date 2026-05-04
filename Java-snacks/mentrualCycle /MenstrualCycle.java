import java.util.Scanner;
 
 public class MenstrualCycle{
 
    public static int[] reads(String inputData){
    
        Scanner input = new Scanner(inputDate);
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        
        return new int[]{year, month, day};        
}    


        
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
           System.out.println("Welcome to Deji mini menstural APP: ");
             System.out.println("What is your name?: ");
            String dejiMini = input.nextLine();
            
           System.out.println("Welcome " + dejiMini); 
         
           System.out.println("Enter flow Date (YYYY MM DD): ");
            String flowDate  = input.nextLine();
            
           System.out.println("Enter ovulation date(YYYY MM DD): "); 
             String ovulationDate = input.nextLine();
              
           System.out.println("Enter safe period: "); 
             String safePeriod = input.nextLine();
             int[] date = reads(inputData);
             int year = data[0];
             int month = date[1];
             int day = date[2];
             System.out.print("Enter average cycle lenght in days: ");
             int cycleLength = input.nextInt();
             
             day += cycleLenght;
             while (day > 30){
                day -= 30;
                month++;
                
              } 
              while (month > 12){
                month -= 12;
                year++;
                
              
              } 
                
             int ovulationDay = day - 14;
             int ovulationMonth = month;
             int ovulationYear = year; 
             
             while (ovulationDay <= 0){
                ovulationDay += 30;
                
                ovulationMonth--;
                    if (ovulationMonth <= 0){
                        ovulationMonth = 12;
                            ovulationYear--;
                    
                    
                    }
             
             }  
                
            System.out.println("result");
            System.out.printf("Next period Date:   %d%d%d%n", year, month, day);
            System.out.printf("calculated Ovulation:   %d%d%d%n", ovulationYear, ovulationMonth, ovulationDay);    
                 
             }
}
             
             
             
             
             
        
        
        
        
    
