package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadEx {
    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        AtomicInteger sum = new AtomicInteger();
        Runnable run1 = () -> {
            for (int i = 1; i<251 ;i++){
                sum.addAndGet(i);
            }
        };
        Runnable run2 = () -> {
            for (int i = 251; i<501 ;i++){
                sum.addAndGet(i);
            }
        };
        Runnable run3 = () -> {
            for (int i = 501; i<751 ;i++){
                sum.addAndGet(i);
            }
        };
        Runnable run4 = () -> {
            for (int i = 751; i<1001 ;i++){
                sum.addAndGet(i);
            }
        };
        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        Thread thread3 = new Thread(run3);
        Thread thread4 = new Thread(run4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();


        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - time);
    }
}
