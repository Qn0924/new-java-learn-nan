public class Test7 {
    public static void main(String[] args) throws Exception{
        //第一种
        Class<?> clazz = Class.forName("User");
        System.out.println(clazz);
        //第二种
        Class clazz2=User.class;
        System.out.println(clazz2);
        //第三种
        User user=new User();
        Class clazz3=user.getClass();
        System.out.println(clazz3);
    }
}
