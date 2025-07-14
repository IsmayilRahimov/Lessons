package testercalculator;

import org.example.testex.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        int c = calculator.add(a,b);

        assertEquals(5,c);
    }
}
