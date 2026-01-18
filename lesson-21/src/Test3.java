public class Test3 {
    public static void main(String[] args) {
        PhoneProx phoneProx=new PhoneProx(new Apple());
        System.out.println(phoneProx.salePhone());
        phoneProx=new PhoneProx(new HuaWei());
        System.out.println(phoneProx.salePhone());
    }
}
