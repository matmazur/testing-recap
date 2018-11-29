import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyCalculatorTest {

    @Test
    public void shouldReturnMultiplicationResult() {

        MyCalculator calculator = new MyCalculator();

        Assertions.assertEquals(9.0, calculator.multiply(3, 3), "jesus christ, this should return 9!");
    }

    @Test
    public void shouldReturnAllNumbersSummed() {

        MyCalculator calculator = new MyCalculator();

        Assertions.assertEquals(17, calculator.add(3, 3, 4, 7), "jesus christ, this should return 17!");
    }


    @Test
    public void shouldThrowNullPointerException() {

        MyCalculator calculator = null;

        Assertions.assertThrows(NullPointerException.class, () -> calculator.add(5, 3));

    }

    @Test
    public void shouldNotThrowNullPointerException() {

        MyCalculator calculator = new MyCalculator();

        Assertions.assertAll(() -> calculator.add(5, 4));

    }
}
