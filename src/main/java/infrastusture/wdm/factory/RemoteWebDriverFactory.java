package infrastusture.wdm.factory;


import infrastusture.ConfigurationManager;

public class RemoteWebDriverFactory implements WebDriverFactory {

    public String create() {
        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "Remote new Google Chrome driver";
            case "firefox":
                return "Remote new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
