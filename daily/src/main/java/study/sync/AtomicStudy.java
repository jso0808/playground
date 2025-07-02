package sync;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicStudy {


    private static final AtomicLong count = new AtomicLong();

    void calculator() throws InterruptedException {
        int max = 10;
        Thread[] ts = new Thread[max];
        for (int i = 0; i < max; i++) {
            ts[i] = new Thread(() -> {
                try { Thread.sleep(1); } catch (InterruptedException ignored) {}
                count.incrementAndGet();   // 원자 + 가시성 OK
            });
            ts[i].start();
        }
        for (Thread t : ts) t.join();
        System.out.println("Total = " + count.get()); // 항상 10
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicStudy atomicStudy = new AtomicStudy();
        atomicStudy.calculator();
    }


}
