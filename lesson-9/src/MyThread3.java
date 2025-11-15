public class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程C==================="+i);
        }
    }
}
