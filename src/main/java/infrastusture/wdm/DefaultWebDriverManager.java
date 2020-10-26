package infrastusture.wdm;

import infrastusture.ConfigurationManager;
import infrastusture.wdm.factory.CloudWebDriverFactory;
import infrastusture.wdm.factory.LocalWebDriverFactory;
import infrastusture.wdm.factory.RemoteWebDriverFactory;
import infrastusture.wdm.factory.WebDriverFactory;


public class DefaultWebDriverManager implements WebDriverManager {
    @Override
    public String getBrowser() {
        String runOn = ConfigurationManager.getInstance().getRunOn();

        WebDriverFactory factory;

        switch (runOn) {
            case "local":
                factory = new LocalWebDriverFactory();
                break;
            case "remote":
                factory = new RemoteWebDriverFactory();
                break;
            case "cloud":
                factory = new CloudWebDriverFactory();
                break;
            default:
                return "";
        }
        return factory.create();
    }

    @Override
    public void destroyBrowser(String browser) {
        if (browser != null) {
            System.out.println("Browser closed");
        }
    }
}
