import static org.junit.jupiter.api.Assertions.assertEquals;

import com.JumToSpring.Calculator;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void testPlus() {
        assertEquals(5, Calculator.plus(2, 3));
    }
}
