public class Test1 {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();
        System.out.println(cashier.getMember("普通会员"));
        System.out.println(cashier.getMember("超级会员"));
        System.out.println(cashier.getMember("Vip会员"));

    }
}
