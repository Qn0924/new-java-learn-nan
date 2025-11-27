import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap();
        treeMap.put(new User(3,"Java"),"Java");
        treeMap.put(new User(5,"JavaMe"),"JavaMe");
        treeMap.put(new User(1,"Hello"),"Hello");
        treeMap.put(new User(6,"JavaEE"),"JavaEE");
        treeMap.put(new User(2,"World"),"World");
        treeMap.put(new User(4,"JavaSE"),"JavaSE");

        Set keys=treeMap.keySet();
        Iterator iterator= keys.iterator();
        while(iterator.hasNext()){
            User key=(User) iterator.next();
            Object o=treeMap.get(key);
            System.out.println(key + "-" + o);
        }
    }
}
