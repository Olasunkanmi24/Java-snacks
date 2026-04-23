public class Table{

    public static void main(String[] args){
    
        for(int count = 1; count <= 5; count++){
        
       int valueOne = (int) Math.pow(count, 1);
       int valueTwo = (int)Math.pow(count, 2);
       int valueThree = (int)Math.pow(count, 3); 
       int valueFour = (int)Math.pow(count, 4);
       
       
       
        System.out.printf("%d\t%d\t%d\t%d%n", valueOne, valueTwo, valueThree, valueFour);
        
        
    }
}



}
