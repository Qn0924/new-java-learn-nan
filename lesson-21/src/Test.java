import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception{
        Class clazz=Student.class;
        Constructor constructor = clazz.getConstructor(null);
        System.out.println(constructor.newInstance());
        Constructor constructor1 = clazz.getConstructor(int.class);
        System.out.println(constructor1.newInstance(1));

    }
}
