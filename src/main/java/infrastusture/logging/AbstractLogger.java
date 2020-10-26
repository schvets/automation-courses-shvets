package infrastusture.logging;

public interface AbstractLogger {
    void log(String msg);
    void closeLog();
}
