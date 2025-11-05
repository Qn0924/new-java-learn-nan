import java.lang.reflect.Method;

public class Test1 {
    public static void main(String[] args) throws Exception {
        Class clazz=Class.forName("User");
        Method test1=clazz.getDeclaredMethod("test1",Integer.class);
        test1.invoke(new User(),"a");
    }
}
