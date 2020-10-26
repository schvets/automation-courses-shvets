package infrastusture;

public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getEnvinromentVariableOrDefault(String envVar, String defaultValue) {
        String currentVarValue = System.getenv(envVar);
        return currentVarValue == null || currentVarValue.isEmpty() ?
                defaultValue : currentVarValue;
    }

    public String getTestBrowser(){
        return getEnvinromentVariableOrDefault("browser", "chrome");
    }

    public String getTestEnvironment(){
        return getEnvinromentVariableOrDefault("environment", "qa_env");
    }

    public String getCurrentEnvironment(){
        return getEnvinromentVariableOrDefault("runEnv", "local");
    }

    public String getRunOn(){
        return getEnvinromentVariableOrDefault("runOn ", "local");
    }
}
