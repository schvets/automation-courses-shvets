package lessons.lesson10.website;


import infrastusture.data.User;

public class LoginTests extends AuthFlowBaseTest {

    @Override
    public void beforeTest(){
        super.beforeTest();
        User user = users.findUserByEmail("test5@gmail.com");

        System.out.println(user.getUserEmail());
        System.out.println(user.getUserPassword());

//        loginPage.enterLogin(user.getEmail());
//        loginPage.enterPassword(user.getPassword());

        logger.log("fill login");
    }

//    public void beforeTest(){
//        beforeAuth();
//        logger.log("switch to registration page");
//        logger.log("fill login");
//        logger.log("fill password");
//    }

    public void loginTest(){
        logger.log("fill password");
        logger.log("submit login form");
        logger.log("check is logged in");
    }

    public void loginTestNegative(){
        logger.log("submit login form");
        logger.log("check error");
    }
}
