public class CarProxy implements Car{

    private Car car;

    public CarProxy(Car car) {
        this.car = car;
    }

    @Override
    public String saleCar() {
        System.out.println("代理模式...");
        return this.car.saleCar();
    }
}
