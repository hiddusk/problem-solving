package interthreadcommunication;

public class Reader implements Runnable {
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            this.message.read();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
