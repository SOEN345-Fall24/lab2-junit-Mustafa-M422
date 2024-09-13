
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void testFunctionA_PositiveY() {
        Example example = new Example(5, 10);
        int result = example.Function_A(7);  // y > 0
        assertEquals(12, result);  // 7 + 5
    }

    @Test
    public void testFunction_A_Negative() {
        Example example = new Example(5, 10);
        int result = example.Function_A(-3); // y <= 0 case
        assertEquals(-8, result); // -3 - 5
    }

    @Test
    public void testFunction_B_LessThanSix() {
        Example example = new Example(5, 10);
        int result = example.Function_B(4); // x < 6 case
        assertEquals(14, result); // 4 + 10
    }

    @Test
    public void testFunction_B_GreaterThanSix() {
        Example example = new Example(5, 10);
        int result = example.Function_B(7); // x >= 6 case
        assertEquals(-3, result); // 7 - 10
    }
}

