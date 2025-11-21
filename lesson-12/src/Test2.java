public class Test2 {
    public static void main(String[] args) {
        StopLock stopLock = new StopLock();
        Thread thread1 = new Thread(stopLock,"线程1");
        thread1.start();
        Thread thread2 = new Thread(stopLock,"线程2");
        thread2.start();
        try {
            Thread.sleep(1000);
            thread2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
