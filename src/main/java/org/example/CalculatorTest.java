package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }
}
