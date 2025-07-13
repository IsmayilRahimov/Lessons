package testcalculator;

import org.example.test.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test

    public   void testAdd(){
        Calculator calculator = new Calculator();
       assertEquals(5,calculator.add(2,3));
       assertEquals(10,calculator.add(5,5));
        System.out.println(calculator.add(2,3));


    }
}