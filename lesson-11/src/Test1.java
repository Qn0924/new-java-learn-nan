public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                User.getInstance();
            }).start();
        }
    }
}
