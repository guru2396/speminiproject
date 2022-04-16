import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {

    @Test
    public void testSqrt(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        double actual=scientificCalculator.squareroot(25.0);
        double expected=5.0;
        double NotExpected=6.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(NotExpected,actual);
    }

    @Test
    public void testNaturalLog(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        double num=145.256;
        double actual= scientificCalculator.naturalLog(num);
        double expected=4.978497702968366;
        double NotExpected=6.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(NotExpected,actual);
    }

    @Test
    public void testFactorial(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        int actual= scientificCalculator.factorial(5);
        int expected=120;
        int notExpected=720;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testPower(){
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        double num=3.0;
        double actual=scientificCalculator.power(num,num);
        double expected=27.0;
        double notExpected=64.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }
}
