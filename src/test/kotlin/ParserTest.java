import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void parser_2Plus5Plus9_ArrayIndexOutOfBoundsExceptionReturned() {
        String[] args = {"2", "+", "5", "+", "9"};
        MainKt.main(args);
    }
    @Test(expected = NumberFormatException.class)
    public void parser_NumPlus5_NumberFormatExceptionReturned() {
        String[] args = {"Num", "+", "5"};
        MainKt.main(args);
    }
    @Test(expected = NumberFormatException.class)
    public void parser_995_NumberFormatExceptionReturned() {
        String[] args = {"9", "9", "5"};
        MainKt.main(args);
    }
    @Test(expected = NumberFormatException.class)
    public void parser_2PlusNum_NumberFormatExceptionReturned() {
        String[] args = {"2", "+", "Num"};
        MainKt.main(args);
    }
    @Test(expected = ArithmeticException.class)
    public void parser_6Divide0_ArithmeticExceptionReturned() {
        String[] args = {"100", "/", "0"};
        MainKt.main(args);
    }

    @Test
    public void exception_NotException(){
        String[] args1 = {"4", "+", "2"};
        String[] args2 = {"4", "-", "2"};
        String[] args3 = {"4", "*", "2"};
        String[] args4 = {"4", "/", "2"};
        if (MainKt.parser(args1) && MainKt.parser(args2) && MainKt.parser(args3) && MainKt.parser(args4)){
            Assert.assertTrue(true);
        }

    }
}
