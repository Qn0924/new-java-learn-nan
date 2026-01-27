import java.util.HashMap;
import java.util.Map;

public class MyDB {
    public static Map<Object,String> map=new HashMap<>();

    static {
//        map.put(1,"Tom");
//        map.put(2,"Cat");
//        map.put(3,"Java");
        map.put("user","123456");
    }

    public static String get(Object key){
        return map.get(key);
    }
}
