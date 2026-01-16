import java.io.Serializable;

public class User extends People implements Serializable,Comparable ,MyInterface{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public User(){

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
