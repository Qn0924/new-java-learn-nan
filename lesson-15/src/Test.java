import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap treeMap=new TreeMap();
        treeMap.put("a","Java");
        treeMap.put("b","JavaMe");
        treeMap.put("c","Hello");
        treeMap.put("d","JavaEE");
        treeMap.put("e","World");
        treeMap.put("f","JavaSE");

        Set keys=treeMap.keySet();
        Iterator iterator= keys.iterator();
        while(iterator.hasNext()){
            String key=(String) iterator.next();
            Object o=treeMap.get(key);
            System.out.println(key + "-" + o);
        }
    }
}
