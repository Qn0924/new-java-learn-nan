public class Account implements Runnable{
    private static int num;
    @Override
    public synchronized void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        num++;
        System.out.println(Thread.currentThread().getName() + "是当前的第" + num + "位访客");
    }
}
