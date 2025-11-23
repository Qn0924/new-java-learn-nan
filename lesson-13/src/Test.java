import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("JavaSE");
        list.add("JavaME");
        list.add("JavaEE");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Java"));
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("Hello");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(1,"List");
        System.out.println(list);
        list.set(1,"set");
        System.out.println(list);
        int index=list.indexOf("Java");
        System.out.println(index);
    }
}
