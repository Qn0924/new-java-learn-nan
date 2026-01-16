import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test6 {
    public static void main(String[] args) throws Exception{
        Class clazz=Userr.class;
        Constructor constructor = clazz.getConstructor(null);
        Method compareTo = clazz.getMethod("compareTo", Object.class);
        System.out.println(compareTo);
        Object invoke = compareTo.invoke(constructor.newInstance(null), 1);
        System.out.println(invoke);
        Method declaredMethod = clazz.getDeclaredMethod("test",null);
        System.out.println(declaredMethod);
    }
}
