public class Gouzaotest {
    public static void main(String[] args) {
        User user=new User(2,"zhangsan",22);
        System.out.println(user);
        //修改属性
        user.id=1;
        //方法调用
        System.out.println(user.num());
        System.out.println(user.id);
        System.out.println(user.name);
        System.out.println(user.age);
    }
}
