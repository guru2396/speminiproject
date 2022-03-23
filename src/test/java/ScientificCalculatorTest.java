import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSqrt(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        double actual=scientificCalculator.squareroot(25.0);
        double expected=5.0;
        Assertions.assertEquals(expected,actual);
    }
}
