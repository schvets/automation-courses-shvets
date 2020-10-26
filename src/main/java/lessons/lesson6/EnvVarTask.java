package main.java.lessons.lesson6;

public class EnvVarTask {
    public static String valueOrdefault(String envVar,
                                        String defaultValue) {
        String currentVarValue = System.getenv(envVar);
        return currentVarValue == null || currentVarValue.isEmpty() ?
                defaultValue :
                currentVarValue;
    }
}
