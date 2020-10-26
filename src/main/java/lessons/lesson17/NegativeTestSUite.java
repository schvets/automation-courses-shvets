package lessons.lesson17;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static lessons.lesson17.Convertor.ConvertorTypes.*;

public class NegativeTestSUite extends BaseTest{
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    private Convertor convertor = new Convertor();

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeConvertData1() {
        System.out.println("testNegativeConvertData1");
        float actualData = convertor.convert(FROM_KILLOGRAMM_TO_GRAMM, -10);
    }

    @Test
    public void testNegativeConvertData2() {
        System.out.println("testNegativeConvertData2");
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("value less then 0 not permitted");
        float actualData = convertor.convert(FROM_KM_TO_L, -100);
    }

}