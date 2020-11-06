package race;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        FirstThread firstThread = new FirstThread(counter);
        Thread secondThread = new Thread(new SecondThread(counter));

        firstThread.start();
        secondThread.start();
    }
}
