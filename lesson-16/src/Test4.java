public class Test4 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer=new StringBuffer("Hello World");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.charAt(2));
        System.out.println(stringBuffer.append("Java"));
        System.out.println(stringBuffer.delete(2, 6));
        stringBuffer.insert(3,"A");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        String s=stringBuffer.toString();
        System.out.println(s);
    }
}
