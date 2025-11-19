import java.util.concurrent.locks.ReentrantLock;

public class Acount implements Runnable{
    private static int num;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        num++;
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "是当前的第" + num + "位访客");
        lock.unlock();
    }
}
