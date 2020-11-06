package race;

import org.apache.log4j.Logger;

public class SecondThread implements Runnable {
    private static final Logger logger = Logger.getLogger(SecondThread.class);
    private final Counter counter;

    public SecondThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.isValueLessThanEndPoint()) {
            int i = counter.increment();
            logger.info("Runnable thread: " + i);
        }
    }
}
