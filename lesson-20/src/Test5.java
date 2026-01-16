import java.lang.reflect.Method;

public class Test5 {
    public static void main(String[] args) {
        Class clazz= Userr.class;
        Method[] methods=clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("******************************");
        Method[] methods1=clazz.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
    }
}
