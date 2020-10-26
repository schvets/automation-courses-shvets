package infrastusture;


import infrastusture.data.UserFileDataMapper;
import infrastusture.data.UserDataMapper;
import infrastusture.logging.AbstractLogger;
import infrastusture.logging.FileTestLogger;
import infrastusture.logging.StdTestLogger;
import infrastusture.wdm.DefaultWebDriverManager;
import infrastusture.wdm.WebDriverManager;


public abstract class TestBase {
    private WebDriverManager wdm;
    protected TestServer server;
    protected AbstractLogger logger;
    protected UserDataMapper users;

    private String browser;

    public void setup(){
        users = new UserFileDataMapper();
        wdm = new DefaultWebDriverManager();
        logger = getLogger();
        browser = wdm.getBrowser();
        server = new TestServer();
        String url = server.getUrl();
        logger.log(url);
        logger.log(browser);
        beforeTest();
    }

    public void tearDown(){
        wdm.destroyBrowser(browser);
    }

    public abstract void beforeTest();

    public void afterTest(){
        logger.closeLog();
    }

    public AbstractLogger getLogger(){
        return ConfigurationManager.getInstance().getRunOn().equals("local")
                ? FileTestLogger.getInstance() : new StdTestLogger();
    }
}
