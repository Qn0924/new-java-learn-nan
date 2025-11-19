public class Test {
    public static void main(String[] args) {
        DeadLockRunnable runnable1 = new DeadLockRunnable();
        runnable1.num=1;
        Thread thread1 = new Thread(runnable1,"张三");
        DeadLockRunnable runnable2 = new DeadLockRunnable();
        runnable2.num=2;
        Thread thread2=new Thread(runnable2,"李四");
        thread1.start();
        thread2.start();
    }
}
