public class Test2 {
    public static void main(String[] args) {
        Class clazz=User.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }
}
