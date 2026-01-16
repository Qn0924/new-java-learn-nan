import java.lang.reflect.Field;

public class Test7 {
    public static void main(String[] args) throws Exception{
        Class clazz=Userr.class;
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------------");
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-------------------");
        Field id = clazz.getField("id");
        System.out.println(id);
        System.out.println("---------------------");
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);

    }
}
