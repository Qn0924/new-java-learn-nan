import java.lang.reflect.Constructor;

public class Test4 {
    public static void main(String[] args) throws Exception{
        Class clazz=User.class;
        Constructor constructor = clazz.getConstructor(null);
//        System.out.println(constructor);
        Object o = constructor.newInstance(null);
        System.out.println(o);
        Constructor constructor1=clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor1);
        Object ob = constructor1.newInstance("张三");
        System.out.println(ob);
    }
}
