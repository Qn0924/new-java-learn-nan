import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student {
    public int id;
    private String name;
    protected char gender;
    double score;

    public Student(){

    }

    public Student(int id){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        System.out.println("学生信息");
        System.out.println("ID:"+this.id);
        System.out.println("姓名：" + this.name);
    }

    public static void main(String[] args) throws Exception{
//        Student student=new Student();
//        student.setId(1);
//        student.setName("张三");
//        student.showInfo();
        Class clazz=Student.class;
        //1.创建实例化对象
        Constructor constructor = clazz.getConstructor(null);
        Object o = constructor.newInstance(null);
        //2.调用setId方法给id赋值
        Method setId = clazz.getMethod("setId", int.class);
        setId.invoke(o,2);
        //3.调用setName方法给name赋值
        Method setName = clazz.getMethod("setName", String.class);
        setName.invoke(o,"李四");
        //4.调用showInfo方法展示数据
        Method showInfo = clazz.getMethod("showInfo", null);
        showInfo.invoke(o,null);
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            int modifiers=field.getModifiers();
            Class<?> type = field.getType();
            String name1 = field.getName();
            String mo=getModifiers(modifiers);
            System.out.println("属性："+name1+",访问权限修饰符："+mo+",数据类型："+type);
        }

    }

    public static String getModifiers(int modifiers){
        String result=null;
        switch (modifiers){
            case 0:
                result="";
                break;
            case 1:
                result="public";
                break;
            case 2:
                result="private";
                break;
            case 4:
                result="protected";
                break;
        }
        return result;
    }
}
