public class Test6 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("-------------------------线程A" + i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("线程B==========================" + i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("!!!!!!!!!!!!!!C!!!!!!!!!!!!" + i);
            }
        }).start();
    }
}
