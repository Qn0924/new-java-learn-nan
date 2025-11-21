import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TimeLock implements Runnable{
    private ReentrantLock reentrantLock=new ReentrantLock();
    @Override
    public void run() {
        try {
            if(reentrantLock.tryLock(6, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName() + "get lock");
                Thread.sleep(5000);
            }else{
                System.out.println(Thread.currentThread().getName() + "not lock");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }
    }
}
