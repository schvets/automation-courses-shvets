
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class BaseTestSuite {
    @Before
    public void before(){
        System.out.println("before method");
    }

    @After
    public void after(){
        System.out.println("after method");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass()
    public static void afterClass(){
        System.out.println("after class");
    }
}
