package sync;

public class SynchronizedStudy {


    private static long count = 0;

    public void calculator() throws Exception {
        int maxCount = 10;

        for (int i = 0; i < maxCount; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                plusCount();
            }).start();
        }

        Thread.sleep(100);
        System.out.println("Total Count: " + count);
    }


    public synchronized void plusCount() {
        this.count++;
    }

    public static void main(String[] args) throws Exception {
        SynchronizedStudy synchronizedStudy = new SynchronizedStudy();
        synchronizedStudy.calculator();
    }


}
