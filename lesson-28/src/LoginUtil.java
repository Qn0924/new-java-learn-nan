import java.util.List;

public class LoginUtil {
    public static Account login(String username, String password) {
        List<Account> accounts = MyDB.accounts;
        Account result = null;
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                result = account;
            }
        }
        if(result==null){
            Account account=new Account();
            account.setCode(-2);
            return account;
        }else{
            if (result.getPassword().equals(password)) {
                return result;
            }else{
                Account account=new Account();
                account.setCode(-1);
                return account;
            }
        }
    }
}