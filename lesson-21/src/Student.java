import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Student {
    private int id;
    private String name;

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
    }
}
