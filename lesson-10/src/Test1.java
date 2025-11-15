public class Test1 {
    public static void main(String[] args) {
        JoinRunnable joinRunnable = new JoinRunnable();
        Thread thread = new Thread(joinRunnable);
        thread.start();

        for (int i = 0; i < 100; i++) {
            if(i==10){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(i+"++++++++++++++main");
        }
    }
}
