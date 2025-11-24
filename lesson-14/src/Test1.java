import java.util.*;
public class Test1 {
    public static void main(String[] args) {
        Hashtable hashtable=new Hashtable();
        hashtable.put("h","hello");
        hashtable.put("w","world");
        hashtable.put("j","java");
        hashtable.put("s","JavaSE");
        hashtable.put("m","JavaME");
        hashtable.put("e","JavaEE");
        System.out.println(hashtable);
        hashtable.remove("e");
        System.out.println(hashtable);
        hashtable.put("m","Moudle");
        System.out.println(hashtable);
        System.out.println(hashtable.containsKey("a"));
        System.out.println(hashtable.containsValue("Java"));
        Set set=hashtable.keySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Collection value=hashtable.values();
        Iterator iterator1=value.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
