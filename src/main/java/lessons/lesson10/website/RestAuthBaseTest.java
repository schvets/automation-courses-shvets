package lessons.lesson10.website;


import infrastusture.TestBase;

public class RestAuthBaseTest extends TestBase {

    @Override
    public void beforeTest(){
        logger.log("REST auth");
        logger.log("refresh page");
    }
}
