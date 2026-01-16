import java.io.Serializable;

public class User extends People implements Serializable,Comparable ,MyInterface{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public User(){
        System.out.println("调用了User无参构造函数");
    }
    public User(int id){

    }

    private User(String name){

    }

    protected  User(int id,String name){

    }

    User(Double num){

    }
}
