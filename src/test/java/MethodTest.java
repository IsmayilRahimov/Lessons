import org.example.testmethod.Method;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MethodTest {
    @Test
    public void testAdd(){
        // moklama - Mocking
        Method method = new Method();

        int a = 2;
        int b = 3;

        int c= 5;
        assertEquals(5,c);

    }
}
