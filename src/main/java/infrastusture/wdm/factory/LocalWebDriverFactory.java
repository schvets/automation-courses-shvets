package infrastusture.wdm.factory;


import infrastusture.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory {

    public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "Local new Google Chrome driver";
            case "firefox":
                return "Local new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
