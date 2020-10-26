package lessons.lesson10.website;

public class TestSuite {
    public static void main(String[] args) {
//        AbstractLogger mailLogger = new AbstractLogger() {
//            @Override
//            public void log(String msg) {
//                Mailsender sender = new Mailsender();
//                sender.sendLog(msg);
//
//            }
//        };
//
//        mailLogger.log("");


        LoginTests test1 = new LoginTests();
        test1.setup();
        test1.loginTest();
        test1.tearDown();

        test1.setup();
        test1.loginTestNegative();
        test1.tearDown();

        RegistrationTests test2 = new RegistrationTests();
        test2.setup();
        test2.registrationTestNegative();
        test2.tearDown();

        test2.setup();
        test2.registrationTestPositive();
        test2.tearDown();

        test2.afterTest();

    }
}
