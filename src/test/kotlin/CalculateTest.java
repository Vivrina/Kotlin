import org.junit.Assert;
import org.junit.Test;

public class CalculateTest {
    @Test
    public void sum_2Plus5_7Returned() {
        int result = MainKt.calculate(2, "+", 5);
        Assert.assertEquals(result, 7);
    }
    @Test
    public void sub_10Minus5_5Returned() {
        int result = MainKt.calculate(10, "-", 5);
        Assert.assertEquals(result, 5);
    }
    @Test
    public void mult_3Multiply2_6Returned() {
        int result = MainKt.calculate(3, "*", 2);
        Assert.assertEquals(result, 6);
    }
    @Test
    public void div_40Divide5_8Returned() {
        int result = MainKt.calculate(40, "/", 5);
        Assert.assertEquals(result, 8);
    }
    @Test
    public void nothing_AnotherOperator_0Returned(){
        int result = MainKt.calculate(10, "0", 2);
        Assert.assertEquals(result, 0);
    }
}
