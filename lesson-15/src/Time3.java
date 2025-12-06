public class Time3<T> {
    public static void main(String[] args) {
        //传具体数据类型
        test(new Time3<Number>());
        test(new Time3<Byte>());
        test(new Time3<Short>());
        test(new Time3<Long>());
        test(new Time3<Integer>());
        test(new Time3<Double>());
        test(new Time3<Float>());
        test1(new Time3<Object>());
        test1(new Time3<String>());
    }
    //泛型上限是Number,Number的子类或者其本身都可以传
    public static void test(Time3<? extends Number > time) {

    }
    //泛型下限是String,String的父类或者其本身可以传但这个父类只有Object
    public static void test1(Time3<? super String> time){

    }
}
