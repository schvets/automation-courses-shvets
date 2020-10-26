package infrastusture;

public class TestServer {
    public String getUrl() {
        String testEnvironment = ConfigurationManager.getInstance().getTestEnvironment();
        switch (testEnvironment) {
            case "qa_env":
                return "http://qa.env.mysite.com";
            case "prod_env":
                return "http://prod.env.mysite.com";
            case "staging_env":
                return "http://staging.env.mysite.com";
            default:
                return "";
        }
    }

    public String getUrl(String testEnvironment) {
        switch (testEnvironment) {
            case "qa_env":
                return "http://qa.env.mysite.com";
            case "prod_env":
                return "http://prod.env.mysite.com";
            case "staging_env":
                return "http://staging.env.mysite.com";
            default:
                return "";
        }
    }
}
