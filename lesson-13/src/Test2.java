import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.add("Java");
        System.out.println(linkedList);
        linkedList.offer("JavaSE");//添加到后面
        linkedList.addLast("JavaSE2");//添加到最后一个
        System.out.println(linkedList);
        linkedList.push("JavaME");//在前面添加
        linkedList.addFirst("JavaME2");//添加到前面
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("Java"));
        //获取第一个元素
        System.out.println("第一个元素：" + linkedList.peekFirst());
        System.out.println("访问第一个元素之后的集合："+linkedList);
        System.out.println("最后一个元素："+linkedList.peekLast());
        System.out.println("访问最后一个元素之后的集合："+linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);
    }
}
