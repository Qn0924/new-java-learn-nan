import java.util.HashSet;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("Hello");
        hashSet.add("World");
        hashSet.add("Java");
        hashSet.add("Hello");
        System.out.println(hashSet.size());
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        hashSet.remove("Java");
        Iterator iterator1 = hashSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println(hashSet.contains("Java"));
    }
}
