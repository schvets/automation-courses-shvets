package main.java.lessons.lesson12.app;

public class AndroidHistoryScreen implements HistoryScreen{
    @Override
    public void findResult() {
        System.out.println("--> search for result");
    }

    @Override
    public void openResult() {
        System.out.println("--> open for result");
        System.out.println("--> opening result page");
    }
}
