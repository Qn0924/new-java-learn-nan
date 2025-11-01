public class Test3 {
    public static void main(String[] args) {
        EquipmentA A = new EquipmentA();
        EquipmentB B = new EquipmentB();
        Factory factory=new Factory();
        factory.setEquipment(B);

        factory.work();

    }
}
