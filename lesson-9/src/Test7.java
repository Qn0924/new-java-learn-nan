public class Test7 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        MyThread3 myThread3 = new MyThread3();
        myThread3.start();
    }
}
