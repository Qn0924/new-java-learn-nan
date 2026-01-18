public class Test4 {
    public static void main(String[] args) {
        CarProxy carProxy=new CarProxy(new BMW());
        System.out.println(carProxy.saleCar());
        carProxy=new CarProxy(new Benz());
        System.out.println(carProxy.saleCar());
    }
}
