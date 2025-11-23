import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Test4 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Hello");
        linkedHashSet.add("World");
        linkedHashSet.add("Java");
        linkedHashSet.add("Hello");
        System.out.println(linkedHashSet.size());
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        linkedHashSet.remove("Java");
        Iterator iterator2 = linkedHashSet.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
    }
}
