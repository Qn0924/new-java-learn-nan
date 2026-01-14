public class Test2 {
    public static void main(String[] args) {
        String str1="Hello";
        String str3="Hello";
        System.out.println(str1==str3);
        String str2=new String("World");
        String str4=new String("World");
        System.out.println(str2==str4);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str2.equals(str4));
    }
}
