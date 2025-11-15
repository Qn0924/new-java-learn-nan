public class Test7 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        MyThread3 myThread3 = new MyThread3();
        Thread t1=new Thread(myThread);
        Thread t2=new Thread(myThread2);
        Thread t3=new Thread(myThread3);
        t1.start();
        t2.start();
        t3.start();
    }
}
