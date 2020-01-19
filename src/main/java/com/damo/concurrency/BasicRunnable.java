package main.java.com.damo.concurrency;

public class BasicRunnable implements Runnable{
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
        Thread test1 = new Thread(new BasicRunnable(), "t1");
        Thread test2 = new Thread(new BasicRunnable(), "t2");

        System.out.println("Starting threads");
        test1.start();
        test2.start();
        System.out.println("Runnable threads has been started");

        Thread t3 = new BasicThread();
        Thread t4 = new BasicThread();
        System.out.println("Starting threads");
        t3.start();
        t4.start();
        System.out.println("Runnable threads has been started");

    }
}
