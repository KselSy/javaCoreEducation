package thread;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "Stepan");
        concurrentHashMap.put(2, "Anton");
        concurrentHashMap.put(3, "Sergey");
        concurrentHashMap.put(4, "Liza");
        concurrentHashMap.put(5, "Nika");
        System.out.println(concurrentHashMap);

        Runnable run1 = () -> {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            for (int i = 1; i < 6; i++) {
                System.out.println(i + ":" + concurrentHashMap.get(i));
            }
        };
        Runnable run2 = () -> {
            for (int i = 5; i > 0; i--) {
                concurrentHashMap.put(i, "Имя " + concurrentHashMap.get(i) + " состоит из "
                        + concurrentHashMap.get(i).length() + " букв");
                System.out.println(i + ":" + concurrentHashMap.get(i));
            }
        };

        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);

        thread1.start();
//        System.out.println(thread1.getName() + " начал работу");
//        thread1.join();
//        System.out.println(thread1.getName() + " закончил работу");

//        System.out.println(thread2.getName() + " начал работу");
        thread2.start();
//        thread2.join();
//        System.out.println(thread2.getName() + " закончил работу");
    }
}

