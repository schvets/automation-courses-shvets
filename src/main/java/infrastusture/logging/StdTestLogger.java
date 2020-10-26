package infrastusture.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StdTestLogger implements AbstractLogger {
    public static int counter = 0;

    public void log(String opreration){
        System.out.println(getEntry(opreration));
    }

    @Override
    public void closeLog() {

    }

    private String getEntry(String opreration) {
        counter++;
        Date curDate = new Date();
        String formatedDate = new SimpleDateFormat("HH:mm:ss.SSS").format(curDate.getTime());
        return counter + ") " + formatedDate + "[" + Thread.currentThread().getName() + "]: " + opreration;
    }

}
