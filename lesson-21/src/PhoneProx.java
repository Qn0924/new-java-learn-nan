public class PhoneProx implements Phone{
    private Phone phone;

    public PhoneProx(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String salePhone() {
        System.out.println("代理模式。。。");
        return this.phone.salePhone();
    }
}
