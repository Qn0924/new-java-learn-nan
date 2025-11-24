import sun.reflect.generics.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class Test5 {
    public static void main(String[] args) {
        TreeSet treeset = new TreeSet();
        treeset.add("1");
        treeset.add("3");
        treeset.add("6");
        treeset.add("2");
        treeset.add("5");
        treeset.add("4");
        treeset.add("1");
        System.out.println(treeset.size());
        Iterator iterator = treeset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
