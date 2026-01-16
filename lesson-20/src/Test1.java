public class Test1 {
    public static void main(String[] args) {
        //获取Class
        Class clazz= Userr.class;
        Class[] interfaces=clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }
}
