public class Test1 {
    public static void main(String[] args) {
        Byte byt=new Byte("1");
        byte b=byt.byteValue();
        System.out.println("包装类是："+byt+"基本数据类型是："+b);
        Short sh=new Short("2");
        short s=sh.shortValue();
        System.out.println("包装类是："+sh+"基本数据类型是："+s);
        Integer integer=new Integer("3");
        int i=integer.intValue();
        System.out.println("包装类是："+integer+"基本数据类型是："+i);
        Long long1=new Long("4");
        long l=long1.longValue();
        System.out.println("包装类是："+long1+"基本数据类型是："+l);
        Float f1=new Float("5.5");
        float f=f1.floatValue();
        System.out.println("包装类是："+f1+"基本数据类型是："+f);
        Double d1=new Double("6.0");
        double d=d1.doubleValue();
        System.out.println("包装类是："+d1+"基本数据类型是："+d);
        Character character=new Character('J');
        char c=character.charValue();
        System.out.println("包装类是："+character+"基本数据类型是："+c);
        Boolean b1=new Boolean("true");
        boolean b2=b1.booleanValue();
        System.out.println("包装类是："+b1+"基本数据类型是："+b2);
//        System.out.println(byt);
//        System.out.println(sh);
//        System.out.println(integer);
//        System.out.println(long1);
//        System.out.println(f1);
//        System.out.println(d1);
//        System.out.println(character);
//        System.out.println(b1);



    }
}
