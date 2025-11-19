public class User {

    private static User Instance;
    private User(){
        System.out.println("创建了User对象");
    }

    public  synchronized static User getInstance(){
        if(Instance == null){
            Instance = new User();
        }
        return Instance;
    }
}
