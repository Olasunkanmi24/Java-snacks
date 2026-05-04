import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetTest {
    @Test
    
public void testToCheckGreet(){

    String name = "Deji";
    
    String expectedValue = "Hello Deji";
    
    String actualValue = Greet.greetOfWords(name);
    
    assertEquals(expectedValue, actualValue);
    
    
}


    
}
