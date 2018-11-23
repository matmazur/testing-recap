import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void shouldReturnMultiplicationResult(){

        MyCalculator calculator = new MyCalculator();

        Assertions.assertEquals(9.0,calculator.multiply(3,3),"jesus christ, this should return 9!");
    }

    @Test
    public void shouldReturnAllNumbersSummed(){

        MyCalculator calculator = new MyCalculator();

        Assertions.assertEquals(17,calculator.add(3,3,4,7),"jesus christ, this should return 17!");
    }
}
