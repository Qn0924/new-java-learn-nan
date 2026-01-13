public class Test {
    public static void main(String[] args) {
        System.out.println("常量E："+Math.E);
        System.out.println("常量PI："+Math.PI);
        System.out.println("9的平方根："+Math.sqrt(9));
        System.out.println("8的立方根："+Math.cbrt(8));
        System.out.println("2的三次方："+Math.pow(2,3));
        System.out.println("较大值："+Math.max(6.3,3.5));
        System.out.println("较小值："+Math.min(6.3,3.5));
        System.out.println("-10.3的绝对值是：" + Math.abs(-10.3));
        //比10.001大的最小整数
        System.out.println(Math.ceil(10.001));
        //比10.999小的最大整数
        System.out.println(Math.floor(10.999));
        //最小树0-1之间
        System.out.println(Math.random());
        //四舍五入
        System.out.println(Math.round(5.6));
    }
}
