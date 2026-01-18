public class Test5 {
    public static void main(String[] args) {
        MyInvocationHandler myInvocationHandler=new MyInvocationHandler();
        Phone phone=(Phone) myInvocationHandler.bind(new Apple());
        System.out.println(phone.salePhone());
        Car car=(Car) myInvocationHandler.bind(new Benz());
        System.out.println(car.saleCar());
    }
}
