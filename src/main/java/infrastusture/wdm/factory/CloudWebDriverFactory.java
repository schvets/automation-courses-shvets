package infrastusture.wdm.factory;


import infrastusture.ConfigurationManager;

public class CloudWebDriverFactory implements WebDriverFactory {

    public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "Cloud new Google Chrome driver";
            case "firefox":
                return "Cloud new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
