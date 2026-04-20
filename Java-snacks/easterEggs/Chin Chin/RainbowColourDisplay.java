import java.util.Random;

public class RainbowColourDisplay{

    public static void main(String[] args){

        Random random = new Random();
        
        int randomNumber = random.nextInt(7) + 1;

        if (randomNumber == 1){
            System.out.println("Violet");
        }
        if (randomNumber == 2){
            System.out.println("indigo");}

        if (randomNumber == 3){
            System.out.println("blue");}


        if (randomNumber == 4){
            System.out.println("yellow");}

         if (randomNumber == 5){
            System.out.println("orange");}   
        
         if (randomNumber == 6){
            System.out.println("Violet");     
        }
                      
    }

}




