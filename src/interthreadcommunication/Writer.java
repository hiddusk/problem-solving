package interthreadcommunication;

public class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        try {
            this.message.write();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

