import java.util.HashMap;
import java.util.Map;

public class MyDB {
    private static Map<Integer,String> map=new HashMap<>();

    static {
        map.put(1,"Tom");
        map.put(2,"Cat");
        map.put(3,"Java");
    }

    public static String get(Integer key){
        return map.get(key);
    }
}
