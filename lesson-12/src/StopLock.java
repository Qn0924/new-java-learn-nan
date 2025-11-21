import java.util.concurrent.locks.ReentrantLock;

public class StopLock implements Runnable {
    private ReentrantLock reentrantLock=new ReentrantLock();
    @Override
    public void run() {
        try {
            reentrantLock.lockInterruptibly();
            System.out.println(Thread.currentThread().getName() + "get lock");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            {
                reentrantLock.unlock();
            }
        }

    }
}
