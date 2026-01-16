import java.lang.reflect.Constructor;

public class Test3 {
    public static void main(String[] args) {
        Class clazz=User.class;
        //获取该类的共有构造函数
        Constructor[] constructors=clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("-----------------------");
        //获取该类的所有构造函数
        Constructor[] constructors1=clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors1) {
            System.out.println(constructor);
        }
    }
}
