package lessons.lesson17;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static lessons.lesson17.Convertor.ConvertorTypes.*;

@RunWith(Parameterized.class)
public class PositiveTestSuite extends BaseTest{
    private Convertor.ConvertorTypes type;
    private float expected;
    private int convertData;

    public PositiveTestSuite(Convertor.ConvertorTypes type, int convertData, float expected) {
        this.type = type;
        this.convertData = convertData;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection coverterData() {
        return Arrays.asList(new Object[][] {
                { FROM_KM_TO_L, 358, 42.95f},
                { FROM_KILLOGRAMM_TO_GRAMM, 1000, 1000000},
                { FROM_METERS_TO_KILOMETERS, 1000, 1 }
        });
    }

    @Test
    public void parametrizedPositiveTest() {
        System.out.println("Parameterized Number is : " + type.name());
        Assert.assertEquals( expected , new Convertor().convert(type, convertData), 0.01);
    }

//    @Test
//    public void testPositiveConvertData1(){
//        Convertor convertor = new Convertor();
//        float actualData = convertor.convert(FROM_KILLOGRAMM_TO_GRAMM, 1000);
//        Assert.assertEquals( 1000000 ,actualData, 0);
//    }
//
//    @Test
//    public void testPositiveConvertData2(){
//        Convertor convertor = new Convertor();
//        float actualData =  convertor.convert(FROM_METERS_TO_KILOMETERS, 1000);
//        Assert.assertEquals(1, actualData, 0);
//    }
//
//    @Test
//    public void testPositiveConvertData3(){
//        Convertor convertor = new Convertor();
//        float actualData =  convertor.convert(FROM_KM_TO_L, 358);
//        Assert.assertEquals(42.95, actualData, 0.0);
//    }
}



//    FROM_METERS_TO_KILOMETERS,
//    FROM_KILLOGRAMM_TO_GRAMM,
//    FROM_KM_TO_L;