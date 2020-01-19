package main.java.com.damo.concurrency;

public class BasicDaemonThread implements Runnable{
    @Override
    public void run() {
        while (true) {
            processing();
        }
    }

    private void processing() {
        System.out.println("Processing daemon thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread dt = new Thread(new BasicDaemonThread(), "dt");
        dt.setDaemon(true);
        dt.start();

        Thread.sleep(10000);
        System.out.println("Finishing program");
    }
}
