package sync;

public class VolatileStudy {


    private static volatile long count = 0;

    public void calculator() throws InterruptedException {
        int maxCount = 10;
        Thread[] workers = new Thread[maxCount];

        for (int i = 0; i < maxCount; i++) {
            workers[i] = new Thread(() -> {
                try { Thread.sleep(1); } catch (InterruptedException e) {}
                count++;                 // 여전히 레이스 컨디션
            });
            workers[i].start();
        }

        for (Thread t : workers) t.join();
        System.out.println("Total Count: " + count); // 10이 아닐 확률 높음
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileStudy volatileStudy = new VolatileStudy();
        volatileStudy.calculator();
    }
}
