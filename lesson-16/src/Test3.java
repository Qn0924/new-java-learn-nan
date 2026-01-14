public class Test3 {
    public static void main(String[] args) {
        char[] array={'J','a','v','a',',','H','e','l','l','o',',','W','o','r','l','d'};
        String str=new String(array);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println("下标为2的字符："+str.charAt(2));
        System.out.println("H的下标是："+str.indexOf("H"));
        String str2="Hello";
        System.out.println("str和str2是否相等："+str.equals(str2));
        String str3="HELLO";
        System.out.println("忽略大小写："+str2.equalsIgnoreCase(str3));
        System.out.println("str是否以Java开头："+str.startsWith("Java"));
        System.out.println("str是否以Java结尾："+str.endsWith("Java"));
        System.out.println("从2开始截取str："+str.substring(2));
        System.out.println("从2到6截取str："+str.substring(2,6));
        System.out.println(str.replaceAll("World","Java"));
        System.out.print("用逗号分割：");
        String split[]=str.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i]+" ");
        }
        System.out.println();
        char[] charArray = str.toCharArray();
        for(char chars:charArray){
            System.out.println(chars);
        }
        System.out.println("str3转化为小写："+str3.toLowerCase());
        System.out.println("str2转化为大写："+str2.toUpperCase());
    }
}
