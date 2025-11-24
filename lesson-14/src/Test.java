import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put("h","hello");
        hashMap.put("w","world");
        hashMap.put("j","java");
        hashMap.put("s","JavaSE");
        hashMap.put("m","JavaME");
        hashMap.put("e","JavaEE");
        System.out.println(hashMap);
        hashMap.remove("e");
        System.out.println("删除元素之后的："+hashMap);
        hashMap.put("m","Moudle");
        System.out.println("添加之后："+hashMap);
        hashMap.put("f","hello");
        System.out.println(hashMap+"：添加");
        System.out.println(hashMap.containsKey("a"));
        System.out.println(hashMap.containsValue("Java"));
        Set set=hashMap.keySet();
        System.out.println(set);
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===========================");
        Collection value= hashMap.values();
        Iterator iterator1=value.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("==========================================");
        Set set1=hashMap.entrySet();
        System.out.println(set1);
        Iterator iterator2=set1.iterator();
        while(iterator2.hasNext()){
            Map.Entry entry=(Map.Entry)iterator2.next();
            Object key1=entry.getKey();
            Object value1=entry.getValue();
            System.out.println("key-value"+":"+key1+"-"+value1);
        }
    }
}
