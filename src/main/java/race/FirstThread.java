package race;

import org.apache.log4j.Logger;

public class FirstThread extends Thread {
    private static final Logger logger = Logger.getLogger(FirstThread.class);
    private final Counter counter;

    public FirstThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isValueLessThanEndPoint()) {
            int i = counter.increment();
            logger.info("Extended Thread: " + i);
        }
    }
}
