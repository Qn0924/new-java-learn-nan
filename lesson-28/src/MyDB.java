import com.test.Account;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyDB {
    public static Map<Object,String> map=new HashMap<>();
    public static List<Account> accounts=new ArrayList<>();

    static {
//        map.put(1,"Tom");
//        map.put(2,"Cat");
//        map.put(3,"Java");
        Account account=new Account();
        account.setUsername("user");
        account.setPassword("123123");
        account.setType("user");
        accounts.add(account);
        account.setCode(0);
        Account account1=new Account();
        account1.setUsername("admin");
        account1.setPassword("123456");
        account1.setType("admin");
        account1.setCode(0);
        map.put("user","123456");
        accounts.add(account1);
    }

    public static String get(Object key){
        return map.get(key);
    }
}
