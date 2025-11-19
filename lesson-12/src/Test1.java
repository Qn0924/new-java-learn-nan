public class Test1 {
    public static void main(String[] args) {
        Acount account = new Acount();
        new Thread(account, "张三").start();
        new Thread(account,"李四").start();
    }
}
