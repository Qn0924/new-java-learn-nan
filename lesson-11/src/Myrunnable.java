public class Myrunnable implements Runnable {
    @Override
    public void run() {
        SynchornizedTest stest = new SynchornizedTest();
        stest.test();
    }
}
