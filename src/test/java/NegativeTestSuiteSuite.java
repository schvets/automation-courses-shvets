
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class NegativeTestSuiteSuite extends BaseTestSuite {
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    private Convertor convertor = new Convertor();

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeConvertData1() {
        System.out.println("testNegativeConvertData1");
        float actualData = convertor.convert(Convertor.ConvertorTypes.FROM_KILLOGRAMM_TO_GRAMM, -10);
    }

    @Test
    public void testNegativeConvertData2() {
        System.out.println("testNegativeConvertData2");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("value less then 0 not permitted");
        float actualData = convertor.convert(Convertor.ConvertorTypes.FROM_KM_TO_L, -100);
    }

}