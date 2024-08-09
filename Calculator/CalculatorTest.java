
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculatorTest {
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2, 3);
        assertEquals(5, result);
    }
    
}
