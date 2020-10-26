package infrastusture.logging;


import infrastusture.logging.AbstractLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDateTime;

public class FileTestLogger implements AbstractLogger, Serializable, Cloneable {
    private String fileName = "log_" + System.currentTimeMillis() + ".log";
    FileWriter fileWriter;
    static String welcomeLogMsg;
    private static FileTestLogger instance;


    private FileTestLogger() {
    }

    public static FileTestLogger getInstance() {
        if (instance == null) {
            instance = new FileTestLogger();
            welcomeLogMsg = "Tests started at " + LocalDateTime.now() + "\n";
        } else{
            welcomeLogMsg = "";
        }

        return instance;
    }

    public void log(String opreration){
        try {
            fileWriter = new FileWriter(new File(fileName), true);
            fileWriter.write(welcomeLogMsg);
            fileWriter.write(opreration +"\n");
            welcomeLogMsg = "";
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void closeLog() {
        try {
            fileWriter = new FileWriter(new File(fileName), true);
            fileWriter.write("Tests finished " + LocalDateTime.now() +"\n");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
