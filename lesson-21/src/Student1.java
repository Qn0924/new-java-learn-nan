import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student1 {
    public int id;
    private String name;
    protected char gender;
    double score;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("学生信息");
        System.out.println("ID:"+this.id);
        System.out.println("姓名：" + this.name);
    }

    public static void main(String[] args) throws Exception {
        Class clazz = Student1.class;
        Constructor constructor = clazz.getConstructor(null);
        Student1 o = (Student1) constructor.newInstance(null);
        o.setId(1);
        o.setName("张三");
        o.setGender('男');
        o.setScore(96.5);
        //Field[] declaredFields = clazz.getDeclaredFields();
        //for (Field declaredField : declaredFields) {
        //Object o1 = declaredField.get(o);
        //System.out.println(o1);
        Field id1 = clazz.getDeclaredField("id");
        int idValue = (int) id1.get(o);
        System.out.println("id的值：" + idValue);
        Field name1 = clazz.getDeclaredField("name");
        String nameValue = (String) name1.get(o);
        System.out.println("name的值：" + nameValue);
        Field gender1 = clazz.getDeclaredField("gender");
        char genderValue = (char) gender1.get(o);
        System.out.println("gender的值：" + genderValue);
        Field score1 = clazz.getDeclaredField("score");
        double scoreValue = (double) score1.get(o);
        System.out.println("score的值为：" + scoreValue);
     //}
        System.out.println("*********************修改属性值***********************");
        id1.set(o,2);
        name1.set(o,"李四");
        gender1.set(o,'女');
        score1.set(o,100);
        System.out.println(id1.get(o));
        System.out.println(name1.get(o));
        System.out.println(gender1.get(o));
        System.out.println(score1.get(o));
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
