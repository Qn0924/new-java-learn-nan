public class SynchornizedTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Myrunnable runnable = new Myrunnable();
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
    public  synchronized void test()  {
        System.out.println("start...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...end");
    }
}
