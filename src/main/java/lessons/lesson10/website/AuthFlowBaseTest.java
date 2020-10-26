package lessons.lesson10.website;


import infrastusture.TestBase;

public class AuthFlowBaseTest extends TestBase {

    @Override
    public void beforeTest() {
        logger.log("open home page");
        logger.log("open login page");
    }

}
