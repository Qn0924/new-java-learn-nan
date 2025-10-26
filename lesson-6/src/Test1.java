public class Test1 {
    public static void main(String[] args) {
        OrdinaryMember ordinaryMember = new OrdinaryMember();
        SuperMember superMember = new SuperMember();
        VipMember vipMember = new VipMember();
        Cashier cashier = new Cashier();

        cashier.settlement(ordinaryMember);
        cashier.settlement(superMember);
        cashier.settlement(vipMember);

    }
}
