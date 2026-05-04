import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class EvenText{
    
    @Test
    public void checkIsEvenText(){
        int even = 2;
        boolean expectedValue = true;
        boolean actualValue = Even.isEven(even);
        
        assertTrue(actualValue);
     
    }
   
    
}
