import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.formativeassesment2mathstring.HelloController;
import org.junit.jupiter.api.Test;

public class InterestCalculatorTest {

    @Test
    public void testInterestEarned_BasicCase() {
        HelloController calculator = new HelloController();
        String input = "P=1000 R=5 T=2";
        double expected = (1000 * 5 * 2) / 100.0; // Expected interest: 100.0
        assertEquals(expected, calculator.interestEarned(input), 0.01);
    }

    @Test
    public void testInterestEarned_DifferentValues() {
        HelloController calculator = new HelloController();
        String input = "P=5000 R=3.5 T=4";
        double expected = (5000 * 3.5 * 4) / 100.0; // Expected interest: 700.0
        assertEquals(expected, calculator.interestEarned(input), 0.01);
    }

    @Test
    public void testInterestEarned_ZeroInterestRate() {
        HelloController calculator = new HelloController();
        String input = "P=2000 R=0 T=5";
        double expected = 0.0; // Expected interest: 0.0
        assertEquals(expected, calculator.interestEarned(input), 0.01);
    }

    @Test
    public void testInterestEarned_ShortTimePeriod() {
        HelloController calculator = new HelloController();
        String input = "P=1500 R=4 T=0.5";
        double expected = (1500 * 4 * 0.5) / 100.0; // Expected interest: 30.0
        assertEquals(expected, calculator.interestEarned(input), 0.01);
    }


}