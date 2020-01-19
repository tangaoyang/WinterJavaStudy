package main.java.com.damo.concurrency;

public class BasicThread extends Thread {
    @Override
    public void run() {
        System.out.println("THREAD START " + Thread.currentThread().getName());
        try {
            Thread.sleep(1);
            Processing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("THREAD END " + Thread.currentThread().getName());
    }

    private void Processing() throws InterruptedException {
        System.out.println("PROCESSING...");
        Thread.sleep(5000);
    }

    public static void main(String[] args) {
        Thread test = new BasicThread();
        test.start();
    }
}
