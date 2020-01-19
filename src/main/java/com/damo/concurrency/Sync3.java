package main.java.com.damo.concurrency;

public class Sync3 implements Runnable{
//    static Sync3 t = new Sync3();
    static int i = 0;


    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
//            synchronized (t) {
//                i++;
//            }
            inc();
//            System.out.println(j);
//            i++;
        }
    }

    static synchronized void inc() {
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Sync3());
        Thread t2 = new Thread(new Sync3());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(i);
    }
}
