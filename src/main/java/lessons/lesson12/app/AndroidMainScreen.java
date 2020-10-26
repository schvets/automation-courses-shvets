package main.java.lessons.lesson12.app;

public class AndroidMainScreen implements MainScreen{
    @Override
    public void uploadFile() {
        System.out.println("--> uploading new files");
        System.out.println("--> waiting for results");
        System.out.println("--> open result screen with current results");
    }

    @Override
    public void openChecks() {
        System.out.println("opening my result screen");
    }
}
