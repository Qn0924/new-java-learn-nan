public class Test1 {
    public static void main(String[] args) {
        OrdinaryMember ordinaryMember = new OrdinaryMember();
        Cashier cashier = new Cashier();
        cashier.setMember(ordinaryMember);
        cashier.settlement();

    }
}
