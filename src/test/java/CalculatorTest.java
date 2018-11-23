import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void shouldReturnMultiplicationResult(){

        MyCalculator calculator = new MyCalculator();

        Double result = calculator.multiply(3,3);

        Assertions.assertEquals(9,calculator.multiply(3,3),"should return 9");
    }
}
